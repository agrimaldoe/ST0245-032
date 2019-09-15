import java.util.*;
import java.io.*;
/**
 * Class which simulate a data structure for the csv archives NOTAS ST0242,
 * NOTAS ST0245 and NOTAS ST0247, where you can do two queries.
 * 
 * @author Alejandro Salazar and Andrés Grimaldos 
 * @version 1
 */ 
public class Queries
{
    /** LinkedList where students are stored.*/
    LinkedList<Student> students = new LinkedList<>();
    /** Auxiliar subject.*/
    Subject sub;
    /** Auxiliar semester.*/
    Semester sem;
    /** Auxiliar semester.*/
    Semester aux; 
    
    /**
     * Method where archives are read.*/
    public void read(String archive){
        try{
            Scanner reader = new Scanner(new File(archive));
            String titles = reader.nextLine();
            while(reader.hasNextLine()){
                reader.nextLine();
                String line = reader.nextLine(); 
                String [] data = line.split(",");
                if(!isStu(data[1])){
                    if(data.length == 15){
                        sub = new Subject(data[2], data[14]);
                    }else{
                        sub = new Subject(data[2], data[13]);
                    }
                    sem = new Semester(data[3],sub);
                    Student s = new Student(data[0],data[1],sem);
                    students.add(s); 
                }else{
                    Student a = searchStud(data[1]);
                   if(searchSem(a, data[3])){
                       aux = isSem(a, data[3]);
                       createSub(data,1);
                   }else{
                       createSub(data,2);
                       sem = new Semester(data[3],sub);
                       a.addSem(sem);
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Your archive couldn't be read");
        }
    }
  
    /**
     * Auxiliar method of read which creates a new Subject.*/ 
    private void createSub(String [] data, int cases){
        if(cases==1){
            if(!searchSub(data[2],aux)){
                if(data.length == 15){
                    sub = new Subject(data[2], data[14]);
                    aux.addSub(sub);
                }else{
                    sub = new Subject(data[2], data[13]);
                    aux.addSub(sub);
                }
            }
        }else{
            if(data.length == 15){
                    sub = new Subject(data[2], data[14]);
                }else{
                    sub = new Subject(data[2], data[13]);
                }            
        }
    }
    
    /**
     * Auxiliar method of read which look for a specific Student.*/
    public Student searchStud(String code){
        for(Student s: students){
            if(s.stuCode.equals(code)){ 
                return s;
            }
        }
        return null;
    }
     
    /**
     * Method which look for if a subject exists in a specific semester.*/
    private boolean searchSub(String subCode, Semester s){
        for(Subject sub: s.subjects){
            if(sub.code.equals(subCode)){
                return true;
            }
        }
        return false;  
    }
     
    /**
     * Method which look for if a student already exists.*/
    private boolean isStu(String code){
        for(Student s: students){
            if(s.stuCode.equals(code)){ 
                return true;
            }
        }
        return false;
    }
    
    /**
     * Method which look for if a student has a specific semester.*/
    private boolean searchSem(Student a, String num){
        for(Semester s: a.semesters){
            if(s.number.equals(num)){ 
                return true;
            }
        }
        return false;
    }
    
    /**
     * Auxiliar method of read which look for a specific Semester.*/
    private Semester isSem(Student a, String sem){
        for(Semester s: a.semesters){
            if(s.number.equals(sem)){ 
                return s;
            }
        }
        return null;
    }
    
    /**
     * Auxiliar Method of query1 which prints what query1 needs.*/
    private void printStuOfSub(String subj, String sem){
        try{
            for(Student s: students){
                for(Semester seme: s.semesters){ 
                    if(seme.number.equals(sem) && seme.getSub(subj) !=null){
                        System.out.println(s.name + " " + seme.getSub(subj).grade);                     
                    }
                }
            }
        }catch(Exception e){
            System.out.println("There's not students at that semester");
        }
    }
    
    /**
     * Auxiliar method of query2 which prints what query2 needs.*/
    private void SubSem(Student a, String sem){
        try{ 
            System.out.print(a.name + " "); 
            for(Semester s: a.semesters){
                if(s.number.equals(sem)){
                    s.printSubOfSem(sem); 
                }
            }
        }catch(Exception e){
            System.out.println("This student doesn't exist");
        }
    }
    
    /**
     * Auxiliar method where gives which archives we have to read.*/
    private void readArchives(){
        read("NOTAS ST0242.csv");
        read("NOTAS ST0245.csv");
        read("NOTAS ST0247.csv");
    }

    /**
     * With a subject code and a semester, this query prints
     * the students of the subject in the semester wished.*/
    public void query1(){
        readArchives();
        Scanner data = new Scanner(System.in);
        System.out.println("Write the subject code in uppercase");
        String Scode = data.next();
        System.out.println("Write the semester without hyphen");
        String semester = data.next();
        System.out.println(Scode + "-" + "Final Grade");
        printStuOfSub(Scode, semester);
    }
    
    /**
     * In this query with a student code and a semester,
     * prints the name of the student and their grades in the subjects of 
     * the semester written.*/   
    public void query2(){
        readArchives();
        Scanner data = new Scanner(System.in);
        System.out.println("Write the student code");
        String stu = data.next();
        Student a = searchStud(stu);
        System.out.println("Write the semester without hyphen");
        String semester = data.next();
        System.out.println(semester);
        SubSem(a, semester); 
    }
}

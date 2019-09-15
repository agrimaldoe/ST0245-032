import java.util.*;
/**
 * Class for create Semesters.
 * 
 * @author Alejandro Salazar and Andrés Grimaldos 
 * @version 1
 */
public class Semester
{
    /**LinkedList of the semester subjects*/
    public LinkedList<Subject> subjects = new LinkedList<>();
    /**Number of the semester*/
    public String number;
    
    /**Constructor of Semester.
       */
    public Semester(String number, Subject s){
        this.number = number;
        this.subjects.add(s);
    }
    
    /**Prints the subjects of a Semester.
       */
    public void printSubOfSem(String sub){
        for(Subject s: this.subjects){
            System.out.print(s.code + " " + "(" + s.grade + ")");
        }
    }
    
    /**Add a subject to a Semester.
       */
    public void addSub(Subject s){
        boolean p = true;
        for(Subject su: subjects){
            if(su.code.equals(s.code)){
                p = false;
            }
        }
        if(p) this.subjects.add(s);
    }
    
    /**Look for a subject in the subjects of a Semester.
       */
    public Subject getSub(String sub){
        for(Subject s: this.subjects){
            if(s.code.equals(sub)){ 
                return s;
            }
        }
        return null;
    }
}

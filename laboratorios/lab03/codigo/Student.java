import java.util.*;
/**
 * Class for create Students.
 * 
 * @author Alejandro Salazar and Andrés Grimaldos 
 * @version 1
 */
public class Student
{
    /**name of the student*/
    public String name;
    /**LinkedList where the semesters of the student where stored*/
    public LinkedList<Semester> semesters = new LinkedList<>();
    /**code of the student*/
    public String stuCode;
    
    /** Constructor of Student
     */
    public Student(String name, String stuCode,Semester s){
        this.name = name;
        this.stuCode = stuCode;
        this.semesters.add(s); 
    }
    
    /**Add a semester to a Student.
       */
    public void addSem(Semester s){
        this.semesters.add(s);
    }
}

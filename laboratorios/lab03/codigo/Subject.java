import java.util.*;
/**
 * Class for create Subjects.
 * 
 * @author Alejandro Salazar and Andrés Grimaldos 
 * @version 1
 */
public class Subject
{
    /**Grade of the subject*/
    public String grade;
    /**Code of the subject*/
    public String code;
    
    /** Constructor of Subject
     */
    public Subject(String code, String grade){
        this.code = code;
        this.grade = grade;
    }
}

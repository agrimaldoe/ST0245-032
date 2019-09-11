import java.util.*;
/**
 * Write a description of class Taller8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio1
{
    public static int polaca(String str){
        String [] numb = str.split(" ");
        Stack<Integer> calc = new Stack<>();
        for(String n: numb){
            if(!Character.isDigit(n.charAt(0))){
                switch(n.charAt(0)){
                    case '+':
                        calc.push(calc.pop() + calc.pop());
                        break;
                    case '-':
                    calc.push(-calc.pop() + calc.pop());
                        break;
                    case '*':
                        calc.push(calc.pop() * calc.pop());
                        break;
                    case '/':
                        calc.push(calc.pop() / calc.pop());
                        break;
                }
            }else{
                calc.push(Integer.parseInt(n));
            }
        }
        return calc.pop();
    }
    
    public static boolean test(){
        int a,b,c,d,a1,b1,c1,d1;
        String s1,s2,s3,s4;
        
        a=14;
        s1 = "3 5 * 12 + 13 -";
        a1 = polaca(s1);
        
        b=-172;
        s2 = "12 5 * 232 -";
        b1 =polaca(s2);
        
        c=884;
        s3 = "34 2 * 13 *";
        c1 = polaca(s3);
        
        d=1260;
        s4 = "67 3 * 21 - 7 *";
        d1 = polaca(s4);
        
        if(a==a1 && c==c1 && b==b1 && d==d1)
            return true;
        return false;
    }
}

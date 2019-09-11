import java.util.*;
/**
 * Write a description of class Taller8 here.
 * 
 * @author (Alejandro Salazar y Andrés Grimaldos) 
 * @version (a version number or a date)
 */
public class Solicitud
{
    String tienda;
    int cantidad;
    public Solicitud(String tienda, int cantidad){
        this.tienda=tienda;
        this.cantidad=cantidad;
    }
}
public class Neveras
{
    int code;
    String desc;
    public Neveras(int code, String desc){
        this.code = code;
        this.desc = desc;
        
    }
}
public class Taller08
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

    public static void neveras(Stack<Neveras> nev, Queue<Solicitud> sol){
        while(!sol.isEmpty()){
            Solicitud act = sol.remove();
            System.out.print(act.tienda+" ");
            for(int i=0;i<act.cantidad;i++){
                try{
                    Neveras act2=nev.pop();
                    System.out.print("( "+act2.code+","+act2.desc+" )" );
                }catch(Exception e){
                    break;
                }
            }
            System.out.println();
        }
    }
}

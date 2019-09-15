import java.util.*;
public class Ejecicio2_1
{
    public static void Ejecicio(String args){
        Scanner sc = new Scanner(args);
        
        while(sc.hasNext()){
            int aux=0;
            int code=-1;
            String sub="";
            String a=sc.nextLine();
            LinkedList<String> lista= new LinkedList<String>();
            for(int i=0; i<a.length();i++){ //C1*n
                if(a.charAt(i)=='['){ //C2*n
                    sub = a.substring(aux,i); // C3*n*n 
                    switch(code){ //C4*n
                        case -1:
                            lista.addFirst(sub); //C5*n
                        break;
                        case 0:
                            lista.addFirst(sub); //C6*n    
                        break;
                        case 1:
                            lista.addLast(sub);  //C7*n because LinkedList in java has a tail    
                        break;
                    }
                    aux=i+1;
                    code=0;
                }else if(a.charAt(i)==']'){ //C8*n
                    sub = a.substring(aux,i); //C9*n 
                    switch(code){
                        case -1:
                            lista.addFirst(sub); //C10*n
                        break;
                        case 0:
                            lista.addFirst(sub);  //C11*n   
                        break;
                        case 1:
                            lista.addLast(sub);   //C12*n  
                        break;
                    }
                    aux=i+1;
                    code=1;
                }
            }
            sub = a.substring(aux); //C13*n
            switch(code){ // C14
                case -1:
                    lista.addFirst(sub); 
                break;
                case 0:
                    lista.addFirst(sub);   
                break;
                case 1:
                    lista.addLast(sub);     
                break;
            }
            printlista(lista);
            System.out.println();
        }
    }
    public static void printlista(LinkedList<String> lista){
        while(true){
            try{
                String a=lista.removeFirst();
                System.out.print(a);
            }catch(Exception e){
                break;
            }
        }
    }
}

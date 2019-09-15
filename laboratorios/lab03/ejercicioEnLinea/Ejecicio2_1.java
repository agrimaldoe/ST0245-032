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
            for(int i=0; i<a.length();i++){
                if(a.charAt(i)=='['){
                    sub = a.substring(aux,i);
                    switch(code){
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
                    aux=i+1;
                    code=0;
                }else if(a.charAt(i)==']'){
                    sub = a.substring(aux,i);
                    switch(code){
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
                    aux=i+1;
                    code=1;
                }
            }
            sub = a.substring(aux);
            switch(code){
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

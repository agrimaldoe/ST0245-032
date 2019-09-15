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
            for(int i=0; i<a.length();i++){ //O(n)
                if(a.charAt(i)=='['){ //O(n)
                    sub = a.substring(aux,i); // O(n*n) 
                    switch(code){
                        case -1:
                            lista.addFirst(sub); //O(1)
                        break;
                        case 0:
                            lista.addFirst(sub); //O(1)    
                        break;
                        case 1:
                            lista.addLast(sub);  //O(1) because LinkedList in java has a tail    
                        break;
                    }
                    aux=i+1;
                    code=0;
                }else if(a.charAt(i)==']'){ //O(n)
                    sub = a.substring(aux,i); //O(n*n) 
                    switch(code){
                        case -1:
                            lista.addFirst(sub); //O(1)
                        break;
                        case 0:
                            lista.addFirst(sub);  //O(1)   
                        break;
                        case 1:
                            lista.addLast(sub);   //O(1)   
                        break;
                    }
                    aux=i+1;
                    code=1;
                }
            }
            sub = a.substring(aux); //O(n)
            switch(code){
                case -1:
                    lista.addFirst(sub); //O(1)
                break;
                case 0:
                    lista.addFirst(sub);  //O(1) 
                break;
                case 1:
                    lista.addLast(sub);  //O(1)    
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

    import java.util.*;
    public class Ejercicio2_2
    {
        public static void Ejercicio(String args){
            Scanner sc = new Scanner(args);
            int total = sc.nextInt();
            Stack lista[] = new Stack[total];
            for(int i=0; i<lista.length; i++){
                lista[i]=new Stack<Integer>();
                lista[i].push(i);
            }
            sc.nextLine();
            while(sc.hasNext()){
                String linea = sc.nextLine();
                System.out.println("1  "+linea);
                boolean pile = false;
                boolean over = false;
                if(linea.contains("quit")){
                    break;
                }
                if(linea.contains("pile")){
                    pile=true;
                }
                if(linea.contains("over")){
                    over=true;
                }
                Scanner line = new Scanner(linea);
                line.next();
                int a = line.nextInt();
                line.next();
                int b = line.nextInt();
                if(pile&&over){
                    Stack auxA = new Stack<Integer>();
                    for(int i=0;i<lista.length;i++){
                        if(lista[i].contains(a)){
                            while(!lista[i].peek().equals(a)){
                                auxA.push(lista[i].pop());
                            }
                            auxA.push(lista[i].pop());
                            if(auxA.contains(b)){
                                while(!auxA.isEmpty()){
                                    lista[i].push(auxA.pop());
                                }
                            }
                            break;
                        }
                    }
                    for(int i=0;i<lista.length;i++){
                        if(lista[i].contains(b)){
                            while(!auxA.isEmpty()){
                                lista[i].push(auxA.pop());
                            }
                            break;
                        }
                    }
                }else if(pile){
                    Stack auxA = new Stack<Integer>();
                    boolean sal=false;
                    for(int i=0;i<lista.length;i++){
                        if(lista[i].contains(a)){
                            while(!lista[i].peek().equals(a)){
                                auxA.push(lista[i].pop());
                            }
                            auxA.push(lista[i].pop());
                            if(auxA.contains(b)){
                                sal=true;
                                while(!auxA.isEmpty()){
                                    lista[i].push(auxA.pop());
                                }
                            }
                            break;
                        }
                    }
                    for(int i=0;i<lista.length;i++){
                        if(lista[i].contains(b)){
                            if(sal)break;
                            while(!lista[i].peek().equals(b)){
                                int c=(int)lista[i].pop();
                                lista[c].push(c);
                            }
                            while(!auxA.isEmpty()){
                                lista[i].push(auxA.pop());
                            }
                            break;
                        }
                    }
                }else if(over){
                    int c=0;
                    for(int i=0;i<lista.length;i++){
                        if(lista[i].contains(a)){
                            while(!lista[i].peek().equals(a)){
                                c=(int)lista[i].pop();
                                lista[c].push(c);
                            }
                            c=i;
                            break;
                        }
                    }
                    for(int i=0;i<lista.length;i++){
                        if(lista[i].contains(b)){
                            lista[i].push(lista[c].pop());
                            break;
                        }
                        
                    }
                }else{
                    for(int i=0;i<lista.length;i++){
                        if(lista[i].contains(a)){
                            while(!lista[i].peek().equals(a)){
                                int c=(int)lista[i].pop();
                                lista[c].push(c);
                            }
                            lista[i].pop();
                            break;
                        }
                    }
                    for(int i=0;i<lista.length;i++){
                        if(lista[i].contains(b)){
                            while(!lista[i].peek().equals(b)){
                                int c=(int)lista[i].pop();
                                lista[c].push(c);
                            }
                            lista[i].push(a);
                            break;
                        }
                    }
                }
            }
            for(int i=0; i<total;i++){
                System.out.print(i+": ");
                lista[i].forEach(k->{System.out.print(k+" ");});
                System.out.println();
            }
    }
}

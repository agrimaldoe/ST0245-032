
/**
 * Clase que simula el comportamiento de un ArrayList y algunos de sus métodos.
 * 
 * @author Alejandro Salazar Arango y Andrés Grimaldos Echavarría 
 * @version 1
 */
public class MyArrayList
{
  private int size;
  private static final int DEFAULT_CAPACITY = 10;
  private int elements [];
  public MyArrayList(){
    size = 0;
    elements = new int[DEFAULT_CAPACITY];
  }
  
  public int size(){
    return size;
  }
  public int get(int i){
      if(i >= 0 && i < size){
          return elements[i];
      }else{
          throw new IndexOutOfBoundsException("Index : " + i);
        }
  }
  
  public void add(int o){
    addInIndex(size, o);
  }

  public void addInIndex(int index, int o){
    if(index >= 0 && index < size){                // O(1)
      for(int i = 0; i < size; i++){               // O(n)
        if(i == elements.length && i == size){     // O(1)
          extend();                                // O(n)+
        }                                         --------------- 
                                                  // result:O(n)  La complejidad 
        if(index == i){                             
          int aux = elements[i];
          elements[i] = o;
          elements[i+1] = aux;
          size++;
        }
      }
    }
    else if(index == size){
        elements[index] = o;
        size++;
        if(size == elements.length){
            extend();
        }
    }
  }

  private void extend(){
    int [] elements2 = new int[elements.length + DEFAULT_CAPACITY];     //O(1)
    for(int i = 0; i < size; i++){                                      // O(n) 
      elements2[i] = elements[i];                                       // O(1)
    }
    elements = elements2;                                               //O(1)+
  }                                                                     -------                         
}                                                                       //result O(n) 

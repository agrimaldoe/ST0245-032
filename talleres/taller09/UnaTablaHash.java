
public class UnaTablaDeHash
{
   
   private int[] tabla;

   public UnaTablaDeHash(){
      tabla = new int[10];
   }

   private int funcionHash(String k){
       return ((int) k.charAt(0)) % 10;
   }
   
   public int get(String k){
       int posPer = funcionHash(k);
       int numPer = tabla[posPer];
       return numPer;
   }

   public void put(String k, int v){
       int posPer = funcionHash(k);
       tabla[posPer] = v;
   }
}
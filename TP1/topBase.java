public class topBase{
   public static void main(String[] args){
      tB();
   }
   public static void tB(){
      int size = 8;
      for(int i = 1; i <= size; i++){
         System.out.println();
         for(int j = 1; j < i * 2 - 1; j++){
            System.out.print(" ");
         }
         System.out.print("\\_");
         for(int h = (size + 2 - i) * 2 + 1; h>=1; h--){
            System.out.print("/\\");
         }
         System.out.print("_/");
      }
   }
}
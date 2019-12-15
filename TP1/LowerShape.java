public class LowerShape {
   public static void main(String [] arg) {
      lowerShape();
   }
   
   public static void lowerShape() {
      int j = 0;
      for(int k = 1; k<=4 ;k++) {
         for (int i = 1; i<=j; i++) {
           System.out.print(" ");
         }
         j = j + 2;
         System.out.print("\\_");
         for(int i= 1; i<=(-2*k +13); i++) {
            System.out.print("/\\");
         }
         System.out.println("_/");
      }
   }
}
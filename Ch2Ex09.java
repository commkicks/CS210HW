// CS210 Fall2019 Assignment HW02 excercise #9 "Ch2Ex09" 
// Christopher Marvelle
// 29/SEPT/2019
// Write nested for loops to produce the following output:

public class Ch2Ex09{
   public static void main(String[] args){
      //calls methods in requested order.
      dashLane();
      System.out.println();
      emoji();
      System.out.println();
      countSpam();
      System.out.println();
      dashLane();      
   }
   public static void dashLane(){
      //prints ten times. 40 characters in total
      for(int i = 1; i <= 10; i++){
         System.out.print("----");
      }
   }
   public static void emoji(){
      //prints ten times. 40 characters in total
      for(int j = 1; j <= 10; j++){
         System.out.print("_-^-");
      }
   }
   public static void countSpam(){
      //loops twice. prints 40 characters in total
      for(int l = 1; l <= 2; l++){
         //prints m twice then increases the index by one. 
         for(int m = 1; m <= 10; m++){
            // prints (m % 10) twice, % produces 0 instead of 10
            System.out.print(m % 10);
            System.out.print(m % 10); 
         }
      }
   }
}
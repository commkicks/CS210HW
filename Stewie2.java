// CS210 Assignment HW1 Excercise #8 "Stewie2" 
// Christopher Marvelle CS210
// 22/SEPT/2019
// Prints output as requested by Excercise using a while loop.

public class Stewie2 {
   public static void main(String[] args){
      // "x" is declared as an integer that equals 0. then prints first line.
      int x = 0;
      System.out.println("//////////////////////"); 
      // loops until x equals 4, calling "victory" and increasing x by 1 each loop.  
      while(x <= 4){
         victory();
         x++;
      }
   }
   // prints the two repeated lines
   public static void victory(){
      System.out.println("|| Victory is mine! ||");
      System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
   }
}
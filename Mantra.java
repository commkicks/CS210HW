// CS210 Assignment HW1 Excercise #7 "Mantra" 
// Christopher Marvelle CS210
// 22/SEPT/2019
// Prints output as requested by Excercise.

public class Mantra {
   public static void main(String[] args){
   // calls method prints a new line then calls method agian.
      phrase();
      System.out.println();
      phrase();
   }
   public static void phrase(){
      System.out.println("There's one thing every coder must ");
      System.out.println("understand:");
      System.out.println("The System.out.println command.");
   }   
}
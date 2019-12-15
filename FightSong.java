// CS210 Assignment HW1 Excercise #12 "FightSong" 
// Christopher Marvelle CS210
// 22/SEPT/2019
// Prints output as requested by Excercise using a while loop.

public class FightSong{
   public static void main(String[] args){
      first();
      System.out.println();
      third();
      System.out.println();
      third();
      System.out.println();
      first();
      }
   // prints the repeated lines
   public static void first(){
      System.out.println("Go, team, go!");
      System.out.println("You can do it.");
   }
   public static void second(){
      System.out.println("You're the best,");
      System.out.println("In the West.");
   }
   public static void third(){
      first();
      second();
      first();
   }
}
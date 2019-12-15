// CS210 Fall2019 Assignment: HW04 excercise #20 "Ch4Ex20" 
// Christopher Marvelle
// 13/OCT/2019
// Write a method called numUnique that takes three integers as parameters and returns the number of unique integers among the three.

import java.util.*; // imports utility for Scanner

public class Ch4Ex20{
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);// call for console input
      System.out.println("Please please enter Three numbers.");
      System.out.print("Number 1: ");
      int x = console.nextInt();
      System.out.print("Number 2: ");
      int y = console.nextInt();
      System.out.print("Number 3: ");
      int z = console.nextInt();
      System.out.println("Amount of Unique numbers: " + numUnique(x, y, z)); 
   }
   public static int numUnique(int numOne,int numTwo,int numThree){
      //lazy loop asking for 3 numbers
      int numCount = 3;
      if (numOne == numTwo && numOne == numThree && numThree == numTwo){
         numCount = 1;
      }else{
         if (numOne == numTwo){
            numCount--;
         } 
         if (numOne == numThree){
            numCount--;
         }
         if (numThree == numTwo){
            numCount--;
         }
      }
      return numCount;
   }
}
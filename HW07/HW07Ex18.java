/* CS210 Fall2019 Assignment: HW07 Ex.18
   Christopher Marvelle
   02/NOV/2019
   Write a method called evenBeforeOdd that accepts an array of integers and rearranges its elements so that all even values appear before all odds.
   The exact order of the elements does not matter, so long as all even values appear before all odd values.
   Do not use any temporary arrays in your solution, and do not call Arrays.sort.
*/
import java.util.*;

public class HW07Ex18{
   public static void main(String[] args){
      int[] list1 = {5, 4, 2, 11, 9, 10, 4, 7, 3};//put list here
      //call method while printing
      System.out.printf(
         "Output for HW 07 Ex. 18.\nAfter sorting "+ Arrays.toString(list1)
         + ": \nThe result is: " + Arrays.toString(evenBeforeOdd(list1)) 
      );//end of print
   }//end of main

   public static int[] evenBeforeOdd(int[] list1) {
      int leftElement = 0, rightElement = list1.length - 1; 
      while (leftElement < rightElement){ 
      // Increment leftElement index while  "0" in leftElement
         while (list1[leftElement]%2 == 0 && leftElement < rightElement) 
            leftElement++; 
      
      // Step rightElement index down while "1" in rightElement
         while (list1[rightElement]%2 == 1 && leftElement < rightElement) 
            rightElement--; 
      
         if (leftElement < rightElement){
            int holder = list1[leftElement]; 
            list1[leftElement] = list1[rightElement]; 
            list1[rightElement] = holder; 
            leftElement++; 
            rightElement--; 
         } 
      }
      return list1;
   }//end of evenBeforeOdd
}//end of prog
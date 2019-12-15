/* CS210 Fall2019 Assignment: HW07 Ex.14
   Christopher Marvelle
   02/NOV/2019
   Write a method called contains that accepts two arrays of integers a 1 a1 and a 2 a2 as parameters and 
   that returns a boolean value indicating whether or not the sequence of elements in a 2 a2 appears in a 1 a1 (true for yes, false for no).
*/
import java.util.*;

public class HW07Ex14{
   public static void main(String[] args){
      int[] list1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};
      int[] list2 = {2, 1, 2};
      boolean result = contains(list1, list2);
      if(result){
         System.out.printf("Output for HW 07 Ex. 14:\nThe elements of the second array DO appear in the first array.");
      }else{
         System.out.printf("Output for HW 07 Ex. 14:\nThe elements of the second array DO NOT appear in the first array.");
      }
   }//end of main
   
   public static boolean contains(int[] list1, int[] list2) {
      for (int firstIndex = 0; firstIndex <= list1.length - list2.length; firstIndex++) {
         int count = 0;
        
         for (int secondIndex = 0; secondIndex < list2.length; secondIndex++) {   
            if (list2[secondIndex] == list1[firstIndex + secondIndex]) {
               count++;
            }
         }
        
         if (count == list2.length) {
            return true;
         }
      }
    
      return false;
   }//end of lastIndexOf
}//end of prog
// CS210 Fall2019 Assignment: HW07 Ex.02
// Christopher Marvelle
// 02/NOV/2019
// Write a method called range that returns the range of values in an array of integers. 

import java.util.*;

public class HW07Ex02{
   public static void main(String[] args){
      int[] list = {3, 10000000, 5, -29, 4};
      // print output and call method
      System.out.printf(
         "Output for HW 07 Ex. 02. \nThe range of "
         + Arrays.toString(list) +" is: %d", range(list) 
         );
   }//end of main
   
   public static int range(int[] array) {
      int min = array[0];
      int max = array[0];
    
      for (int i = 1; i < array.length; i++) {
         min = Math.min(min, array[i]);
         max = Math.max(max, array[i]);
      }
    
      return max - min + 1;
   }//end of range
}//end of prog
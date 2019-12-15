/* CS210 Fall2019 Assignment: HW07 Ex.01
   Christopher Marvelle
   02/NOV/2019
   Write a method called lastIndexOf that accepts an array of integers and an integer value as its parameters 
   and returns the last index at which the value occurs in the array.
*/
import java.util.*;

public class HW07Ex01{
   public static void main(String[] args){
      int[] list = {74, 85, 102, 99, 101, 85, 56};
      int num = 85;
      System.out.printf( // print output and call method
         "Output for HW 07 Ex. 01. \nThe index of the last occurance of " 
         + num + " in " + Arrays.toString(list) + " is: %d", lastIndexOf(list,num) 
      );
   }//end of main
   
   public static int lastIndexOf(int[] list, int num){
      int index = -1;//sets the default as "-1". this provides the "null output"
      for (int i = 0; i < list.length; i++) {
         if (list[i] == num) {//look for the number
            index = i;
         }
      }
      return index;
   }//end of lastIndexOf
}//end of prog
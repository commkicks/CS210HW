// CS210 Fall2019 Assignment: HW07 Ex.06
// Christopher Marvelle
// 02/NOV/2019
// Write a method called stdev that returns the standard deviation of an array of integers.

public class HW07Ex06{
   public static void main(String[] args){
      int[] list = {4, 5, 6, 18, 19, 20, 51, 52, 53};
      // print output and call method
      System.out.printf(
         "Output for HW 07 Ex. 06. \nThe standard deviation of the provided list: %f", stdev(list) 
         );
   }//end of main
   
   public static double stdev(int[] array) {
      int sum = 0;
      double top = 0;
    
      for (int index = 0; index < array.length; index++) {
         sum += array[index];
      }    
      double average = (double)sum / array.length;  
           
      for (int index = 0; index < array.length; index++) {
         top += Math.pow(array[index] - average, 2);
      }    
      return Math.sqrt(top / (array.length - 1));
   }//end of stdev
}//end of prog
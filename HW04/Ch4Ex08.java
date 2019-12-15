// CS210 Fall2019 Assignment: HW04 excercise #08 "Ch4Ex08" 
// Christopher Marvelle
// 13/OCT/2019
// Write a method called smallestLargest that accepts a Scanner for the console as a parameter and asks the user to enter numbers, then prints the smallest and largest of all the numbers supplied by the user. 
// You may assume that the user enters a valid number greater than 0 for the number of numbers to read.

import java.util.*; // imports utility for Scanner

public class Ch4Ex08{
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);// call for console input
      System.out.print("How many numbers do you want to enter? ");
      int reps = console.nextInt();// using int because, how does one loop "decimal" times
      smallestLargest(reps, console);// sends int and scanner to method      
   }
   // method collects numbers, compares, and then prints result.
   public static void smallestLargest(int num, Scanner console){
      int highNum = 0;
      int lowNum = 0;   
      if (num <= 0){ //textbook says user will use #'s > 0, but in case PEBKAC.
         System.out.println("Please use a number greater than 0.");
         return;   
      } else { // if PEBKAC == false, run loop to request for "num" amount of users 
         for(int i = 1; i <= num; i++){
            System.out.print("Number " + i + ": ");
            int numTest = console.nextInt();
            if (i == 1){ // if loop is running for the first time then take first entry for comparison.
               highNum = numTest;
               lowNum = numTest;
            }
            highNum = Math.max(numTest, highNum);//store number if numTest>highNum
            lowNum = Math.min(lowNum, numTest);//store number if numTest<lowNum
         }
      }
      //once checks are finished print final results
      System.out.println("Smallest = " + lowNum);
      System.out.println("Largest = " + highNum);
      
   } 
}
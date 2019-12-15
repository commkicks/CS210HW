// CS210 Fall2019 Assignment: HW06 Ex 16 "mostCommonNames"
// Christopher Marvelle
// 27/OCT/2019
// Write a method called mostCommonNames that accepts a Scanner representing an input file with names on each line separated by spaces. 
// Some names appear multiple times in a row on the same line. For each line, print the most commonly occurring name. 
// If there’s a tie, use the first name that had that many occurrences; if all names are unique, print the first name on the line.

//import packages

import java.io.*;
import java.util.*; 

public class HW06Ex16{
   public static void main(String[] args) 
          throws FileNotFoundException {
      // to skip finding files. Enter text by replacing new File("test.txt")
      Scanner testInput = new Scanner(new File("test.txt"));
      System.out.printf("Output for HW06 Ex. 16: \nListing the most common names.\n");
      System.out.printf("Total Names: %d",mostCommonNames(testInput));
   }

   public static int mostCommonNames(Scanner input){
     int totalNames = 0;
   
     while (input.hasNextLine()){
        Scanner list = new Scanner(input.nextLine());//takes the line and keeps it as a scanner to continue searching
        String prevName = list.next();//grab first name in list
        String topName = prevName;//first name is topname unless replaced
        int mostCount = 1;
        int count = 1;
      
        totalNames++;//increment total
      
        while(list.hasNext()){
           String name = list.next();
           if( name.equals(prevName) ){
              count++;//increment if name repeats
           }else{
              if(count > mostCount){//set tops
                 mostCount = count;
                 topName = prevName;
              }//end of inner if
              count = 1;
              totalNames++;   
           }//end of if else
           prevName = name;           
        }//end of name while
        if(count > mostCount){
           topName = prevName;
        }
        System.out.println("Most common: " + topName );
     }//end of while
     return totalNames;
   }// end of mostCommonNames

}//end of program
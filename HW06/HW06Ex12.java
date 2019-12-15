// CS210 Fall2019 Assignment: HW06 Ex12 "stripHtmlTags"
// Christopher Marvelle
// 27/OCT/2019
// Write a method called stripHtmlTags that accepts a Scanner representing an input file containing an HTML  
// web page as its parameter, then reads that file and prints the file’s text with all HTML tags removed. 

//import packages

import java.io.*;
import java.util.*; 

public class HW06Ex12{
   public static void main(String[] args) 
          throws FileNotFoundException {
      // to skip finding files. Enter text by replacing new File("test.txt")
      Scanner testInput = new Scanner(new File("test.txt"));
      System.out.printf("Output for HW06 Ex. 12: \nRemoving HTML Tags from input.\n");
      stripHtmlTags(testInput);
   }
   public static void stripHtmlTags(Scanner input){
      do{
         String content = input.nextLine();
        /* Replace tags starting with "<" and ending with ">" with "".
           ".*?" is an expression that in simple terms means "ignore zero or more of any character" */
         String wantedContent = content.replaceAll("<.*?>", "");
         System.out.println(wantedContent);       
      }while (input.hasNextLine());//end of while 
   }// end of stripHtmlTags
}//end of program
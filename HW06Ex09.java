// CS210 Fall2019 Assignment: HW06 Ex09 "wordWrap"
// Christopher Marvelle
// 27/OCT/2019
// Write a method called wordWrap that accepts a Scanner representing an input file as 
// its parameter and outputs each line of the file to the console,
// word-wrapping all lines that are longer than 60 characters.

//import packages

import java.io.*;
import java.util.*; 

public class HW06Ex09{
   public static void main(String[] args) 
          throws FileNotFoundException {
      // to skip finding files. Enter text by replacing new File("test.txt")
      Scanner testInput = new Scanner(new File("test.txt"));
      System.out.printf("Output for HW06 Ex.09: \nApplying Word Wrap with a limit of 60 characters.\n");
      wordWrap(testInput);
   }

   public static void wordWrap(Scanner input){
      while (input.hasNextLine()){
         String line = input.nextLine();
         int lineLength = line.length();//counter
         int firstChar = 0;
         int lastChar = 60;
         while (lineLength > 60){
            System.out.println(line.substring(firstChar, lastChar));
            firstChar += 60;// add 60 to both to move scope
            lastChar += 60;
            lineLength -= 60;// move on to next 60 chars
         }// end of while        
         System.out.println(line.substring(firstChar, line.length()));
      }//end of while
   }// end of wordWrap
}//end of program
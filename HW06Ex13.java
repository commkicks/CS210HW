// CS210 Fall2019 Assignment: HW06 Ex13 "stripComments"
// Christopher Marvelle
// 27/OCT/2019
// Write a method called stripComments that accepts a Scanner representing an input file containing a Java program as its parameter, 
// reads that file, and then prints the file’s text with all comments removed.

//import packages

import java.io.*;
import java.util.*; 

public class HW06Ex13{
   public static void main(String[] args) 
          throws FileNotFoundException {
      // to skip finding files. Enter text by replacing new File("test.txt")
      Scanner testInput = new Scanner(new File("test.txt"));
      System.out.printf("Output for HW06 Ex. 13: \nRemoving Comments from input code.\n");
      stripComments(testInput);
   }
   
   public static void stripComments(Scanner input){
      do{
         String content = input.nextLine();
         if( content.indexOf("/*") >= 0 && content.indexOf("*/") > 0){
            content = content.replace(content.substring( content.indexOf("/*"), 
                                                            content.indexOf("*/") + 2 ),"");
         }else if ( content.indexOf("/*") >= 0 ){
            continue;            
         }else if (content.indexOf("*/") > 0 ){
            content = content.replace(content.substring( 0 ,content.indexOf("*/") + 2 ),"");
         }
         if (content.indexOf("//") > 0){
            content = content.replace(content.substring( content.indexOf("//"),
                                                            content.length() ),"");
         }//end of if
         content.replace("/*","");
         System.out.println(content);
      }while (input.hasNextLine());//end of while 
   }// end of stripComments
}//end of program
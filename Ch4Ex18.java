// CS210 Fall2019 Assignment: HW04 excercise #18 "Ch4Ex18" 
// Christopher Marvelle
// 13/OCT/2019
// Write a method called wordCount that accepts a String as its parameter and returns the number of words in the String. 
   // A word is a sequence of one or more nonspace characters (any character other than ' ').

import java.util.*; // imports utility for Scanner

public class Ch4Ex18{
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);// call for console input
      System.out.print("Please enter your statement: ");
      String words = console.nextLine();
      System.out.println("Word count is: " + wordCount(words)); 
   }
   public static int wordCount(String words){
      //counts words and returns an integer
      int wordCount = 0;
      boolean wordTest = false;
      int lastChar = words.length() - 1;//find the last char
      if (words == null || words == ""){//test for blank OR null strings
         return 0;
      }else{
         //works through the string and tests for chars and whitespace
         for (int i = 0; i < words.length(); i++){
            boolean b = Character.isLetter(words.charAt(i));// is the char a letter?
            if (b == true && i != lastChar){
            //if there is a letter AND its not the last char, wordTest is true
               wordTest = true;
            } else if (b == false && wordTest == true){
            //if the char is not a letter BUT word test is true then increase word count and reset boolean
               wordCount++;
               wordTest = false;
            } else if (b == true && i == lastChar){
            //if the char is a letter AND its the last char of the string then increase wordcount
               wordCount++;
            }
         }
         //return the word count   
         return wordCount;
      }
   }
}
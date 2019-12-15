// CS210 Fall2019 Assignment: HW04 excercise #02 "Ch4Ex02" 
// Christopher Marvelle
// 13/OCT/2019
// Write a method called repl that accepts a String and a number of repetitions as parameters and returns the String concatenated that many times. 
// For example, the call repl("hello", 3) should return "hellohellohello". If the number of repetitions is zero or less, the method should return an empty string.

import java.util.*; // imports utility for Scanner

public class Ch4Ex02{
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);// call for console input
      System.out.print("Please enter the word you would like to be repeated:");
      String word = console.nextLine();
      System.out.print("How many times would you like it repeated? ");
      int num = console.nextInt();
      System.out.println("Result: " + repl(word, num));      
   }
   public static String repl(String word,int num){
      String newWord ="";
      if (num <= 0){
          newWord = "";
      } else {
         for(int i = 1; i <= num; i++){
            newWord += word;
         }
      }
      return newWord;
   }
}
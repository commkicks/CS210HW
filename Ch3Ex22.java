// CS210 Fall2019 Assignment: HW03 excercise #22 "Ch3Ex22" 
// Christopher Marvelle
// 06/OCT/2019
// Write a program that outputs “The Name Game,” where the user inputs a first and last name and a song is printed about their first, then last, name.

import java.util.*; // imports utility for Scanner

public class Ch3Ex22{
   public static void main(String[] args){
      // call for console input
      Scanner console = new Scanner(System.in);
      // ask user for specific input
      System.out.print("What is your name? ");
      String firstName = console.next();//first word will be bound to firstName.
      String lastName = console.next();//2nd word will be bound to lastname. this means additional words will be ignored
      // calls method for "first name"
      theNameGame(firstName);
      // starts new line and calls method for "last name"
      System.out.println();
      theNameGame(lastName);
   }
   public static void theNameGame(String name){
      // prints song
      // prints a form of 1st line "Fifty Fifty, bo-Bifty"
      System.out.println(name + " " + name + ", bo-B" + name.substring(1, name.length() ));
      // prints a form of 2nd line "Banana-fana fo-Fifty"
      System.out.println("Banana-fana" + " fo-" + "F" + name.substring(1, name.length() ));
      //prints a form of 3rd line "Fee-fi-mo-Mifty"
      System.out.println("Fee-fi-mo-M" + name.substring(1, name.length() ));
      //prints last line then method ends
      System.out.println(name.toUpperCase() + "!");//capitalizes name
   }
}
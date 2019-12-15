// CS210 Fall2019 Assignment: HW06 Ex04 "countCoins"
// Christopher Marvelle
// 27/OCT/2019
// Write a method called countCoins that accepts a Scanner representing an input file whose data is a series of pairs of tokens, 
// where each pair begins with an 1integer and is followed by the type of coin

//import packages

import java.io.*;
import java.util.*; 

public class HW06Ex04{
   public static void main(String[] args) 
          throws FileNotFoundException {
      // to skip finding files. Enter text by replacing new File("test.txt")...ther
      Scanner testInput = new Scanner(new File("test.txt"));
      System.out.printf("Output for HW06 Ex.04: \nCounting coins:\n");
      countCoins(testInput);
   }
   public static void countCoins(Scanner testFile){    
      double sum = 0;//total amount of coins
      // A loop that works through the file
      // then stops when the file has been scanned completely
      while (testFile.hasNext()){
         
         int amount = testFile.nextInt();// find the next int and assign it to  amount
         String coinType = testFile.next().toLowerCase();// find the next string, make it lowercase and match it to coin type
         if (coinType.equals("pennies")){ // Multiply  amount by "coin worth" and add to sum
            sum += ( amount * 0.01);
         }else if(coinType.equals("nickels")){
            sum += ( amount * 0.05);
         }else if(coinType.equals("dimes")){
            sum += ( amount * 0.10);
         }else if(coinType.equals("quarters")){
            sum += ( amount * 0.25);
         }
      }
      System.out.printf("\nTotal money: $%.2f \n",sum);// book wants "Total money"..."Amount:" would be blasphamy 
   }
}//end of program
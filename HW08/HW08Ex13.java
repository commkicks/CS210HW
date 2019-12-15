/*
   CS210 Fall2019 Assignment: HW08 Ex13
   Christopher Marvelle 10/NOV/2019   
   
   Add a transfer method to the BankAccount class from the previous exercises. Your method should move money from the current bank account to another account.
   The method accepts two parameters: a second BankAccount to accept the money, and a real number for the amount of money to transfer. 
   There is a $5.00 fee for transferring money, so this much must be deducted from the current account’s balance before any transfer. 
   The method should modify the two BankAccount objects such that “this” current object has its balance decreased by the given amount plus the $5 fee, 
   and the other account’s balance is increased by the given amount. If this account object does not have enough money to make the full transfer, 
   transfer whatever money is left after the $5 fee is deducted. If this account has under $5 or the amount is 0 or less, 
   no transfer should occur and neither account’s state should be modified.
*/

import java.util.*;

public class HW08Ex13{
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      String firstName, secondName;
      double transferFrom, transferTo;
      
      System.out.printf("Input for HW.08 Ex.13:\nPlease enter the name for the first account: ");
      firstName = console.next();
      System.out.printf("Enter the balance: ");           
      BankAccount firstAccount = new BankAccount( firstName, console.nextDouble());
      System.out.printf("Please enter the name for the second account: ");
      secondName = console.next();
      System.out.printf("Enter the balance: ");           
      BankAccount secondAccount = new BankAccount(secondName, console.nextDouble());
      System.out.printf("How much will " + firstName + " be transfering to " + secondName + "? " );
      firstAccount.transfer(secondAccount, console.nextDouble() );
      
      
      
      // demonstrates excercise 12 with this output
      System.out.printf("Output for HW.08 Ex.13\nnew account information for " + firstName + " is: " + firstAccount.toString() + 
                        "\nnew account information for " + secondName + " is: " + secondAccount.toString() );
   }// main
}
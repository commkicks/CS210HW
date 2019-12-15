// CS210 Fall2019 Assignment: HW05 
// Christopher Marvelle
// 20/OCT/2019
// This program has excercises 04, 08, 09, 11,19.

import java.util.*;

public class HW05Main{
   public static void main(String[] args){
      Scanner console = new Scanner(System.in); // call for console input
      int progSel = 0;
      do{
         progSel = mainMenu(console); //prompt the main menu
         if (progSel == 1){ //run HW05Ex04
            System.out.printf("\nOutput for HW05 Ex04: \n");
            randomX(); 
            progSel = 0;
         }else if(progSel == 2){ //run HW05Ex08
            System.out.printf("\nOutput for HW05 Ex08: \n");
            randomWalk();
            progSel = 0;
         }else if(progSel == 3){//run HW05Ex09
            int num = 0;
            //request User input and test for valid input.
            System.out.printf("Please enter a number to factor: ");
            if (console.hasNextInt()){ //ensures that the user followed directions...
               num = console.nextInt();
            }else{
               System.out.printf("\nInvalid entry\n");
               break;
            }
            System.out.printf("\nOutput for HW05 Ex09: \n");
            printFactors(num); 
            progSel = 0;
         }else if(progSel == 4){// run HW05EX11
            System.out.printf("\nOutput for HW05 Ex11: \n");
            threeHeads();
            progSel = 0;
         }else if(progSel == 5){ //run HW05Ex19
            int num = 0;
            //request User input and test for valid input.
            System.out.printf("Please enter a number: ");
            if (console.hasNextInt()){ //ensures that the user followed directions...
               num = console.nextInt();
            }else{
               System.out.printf("\nInvalid entry\n");
               break;
            }
            System.out.printf("\nOutput for HW05 Ex19: \nThe first digit is: %d \n", firstDigit(num)); 
            progSel = 0;
         }else if(progSel == 6){
            break;
         }else{
            progSel = 0;
            System.out.printf("\n***PLEASE ENTER A VALID INPUT***\n \n");
         }
         System.out.println();
      }while(progSel == 0); // loop will contunue until a "valid" input is recieved.
   }
   
   //Just a method to act as a main menu.
   public static int mainMenu(Scanner console){
      int cmd = 0;
      //use printf to print menu while keeping code visible.
      System.out.printf("Please enter select the program you wish to run:\n");
      System.out.printf("For HW05 Excercise #04. Enter: 1 \nFor HW05 Excercise #08. Enter: 2 \nFor HW05 Excercise #09. Enter: 3 \n");
      System.out.printf("For HW05 Excercise #11. Enter: 4 \nFor HW05 Excercise #19. Enter: 5 \nTo exit this program.   Enter: 6 \n");
      //Test user input
      if (console.hasNextInt()){ //ensures that the user followed directions...
         return cmd = console.nextInt();
      }else{
         return cmd = 8;//8 is just used to declare invalid input.
      }
   }
   
   // HW05Ex04
   // Write a method called randomX that prints a lines that contain a random number of “x” characters 
   // (between 5 and 20 inclusive) until it prints a line that contains 16 or more characters.
   public static void randomX(){
      Random r = new Random();
      int count = 0;
      do{
         int x = r.nextInt(16) + 5;
         for(int i = 1; i <= x; i++){
            System.out.print("x");
         }
         count = x;
         System.out.println();
      }while(count <= 16);
      System.out.printf("\nEnd of output. Returning to Main Menu.\n");
   }
   
   // HW05Ex08
   // Write a method called randomWalk that performs steps of a random one-dimensional walk. 
   // The random walk should begin at position 0. On each step, you should either increase or decrease the position by 1 (each with equal probability).
   // Your code should continue making steps until a position of 3 or −3 is reached, and then report the maximum position that was reached during the walk.
   public static void randomWalk(){
      Random r = new Random();
      int max = 0;
      int pos = 0;
      do{
         int step = r.nextInt(2); // heads or tails?
         System.out.printf("position = %d\n", pos);
         if (step % 2 == 0){//flip a "coin" to determine direction
            pos++;//up
         }else{
            pos--;//down
         } 
         //save max position
         if(pos > max){
            max = pos;
         }
      }while(Math.abs(pos) != 3);
      System.out.printf("position = %d\n", pos);
      System.out.printf("max position = %d\n", max);
   }
   
   // HW05Ex09
   // Write a method called printFactors that accepts an integer as its parameter and uses a fencepost loop to print the factors of that number, separated by the word "and".
   public static void printFactors(int num){
      //factor the number
      for (int i = num; i <= num + 1; i--){
         if(i == num){
            System.out.print("1");// for first lap
         }else if(i == 0){
            break; //leaves the loop if i goes too low 
         }else if((num % i) == 0){
            System.out.print(" and " + (num/i)); //prints factors
         }         
      }
      System.out.println();//prints out a new line for readability
   }
   
   // HW05Ex11
   // Write a method called threeHeads that repeatedly flips a coin until the results of the coin toss are three heads in a row.
   // You should use a Random object to make it equally likely that a head or a tail will appear.
   public static void threeHeads(){
      Random r = new Random();
      int headCount = 0;
      do{
         int coin = r.nextInt(2) + 1;
         if(coin == 1){
            System.out.print("T ");
            headCount = 0;//reset the counter evertime there is a "Tails"
         }else{
            System.out.print("H ");
            headCount++;
         }
      }while(headCount != 3);
      System.out.printf("\nThree heads in a row!\n");   
   }
   
   // HW05Ex19
   // Write a method named firstDigit that returns the first digit of an integer.
   public static int firstDigit(int num){
      int testNum = Math.abs(num);
      while (testNum >= 10){ // loop till in the ones place
         testNum /= 10; //scoot that decimal point over once per lap.
      }
      return testNum;
   }
}//end of the road.       
// CS210 Fall2019 Assignment: HW04 excercise #15 "Ch4Ex15" 
// Christopher Marvelle
// 13/OCT/2019
// Write a method called smallestLargest that accepts a Scanner for the console as a parameter and asks the user to enter numbers, then prints the smallest and largest of all the numbers supplied by the user. 
// You may assume that the user enters a valid number greater than 0 for the number of numbers to read.

import java.util.*; // imports utility for Scanner

public class Ch4Ex15{
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);// call for console input
      System.out.print("Please enter your grade (0-100): ");
      int grade = console.nextInt();
      // if grade is outside of [0,100] then throws IllegalArgumentException
      if (grade > 100 || grade < 0){
        throw new IllegalArgumentException(grade + " is out of range. If real then reconsider life.");
      } else {
         System.out.println("Your current GPA is: " + getGrade(grade, console) + ".");
      }      
   }
   public static double getGrade(int grade, Scanner console){
      // This method will calculate GPA
      double gpa = 0.0;
      if (grade < 60){
         // if grade is < 60 then GPA = 0.0
         return gpa;
      } else if (grade >= 60 && grade <= 62){
         // if grade is 60 - 62 then GPA = 0.7
         return gpa = 0.7;
      } else if (grade >= 95){
         // if grade is >=95 then GPA = 4.0
         return gpa = 4.0;
      } else {
         // Between 63 - 94 increase GPA by 0.1 per point; 62 = 0.7 then 63 = 0.8
        return gpa = (0.1 * (grade - 63)) + 0.8; 
      }
   }
}\\'\"\""
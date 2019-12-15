// CS210 Fall2019 Assignment: HW03 excercise #8 "Ch3Ex08" 
// Christopher Marvelle
// 06/OCT/2019
// Write a method called quadratic that solves quadratic equations and prints their roots. 
// Recall that a quadratic equation is a polynomial equation in terms of a variable x of the form a*(x)^2+b*x+c=0

public class Ch3Ex08{
   public static void main(String[] args){
      //parameter key; quadratic(a,b,c); a*(x)^2+b*x+c=0 -.
      quadratic(1, 3, 2);
   }
   public static void quadratic(int a,int b,int c){
      //this will print the 1st and 2nd root
      //formula: ((-b) + Math.sqrt(Math.pow(b,2)-4*a*c))/ (2*a))
      double quadStepOne = Math.sqrt(Math.pow(b,2)-4*a*c);
      //"1st root" will test the addition & "2nd root" will test subtraction
      System.out.println("First root = " + (((-b) + quadStepOne) / (2*a)));
      System.out.println("Second root = " + (((-b) - quadStepOne) / (2*a)));
   }
}
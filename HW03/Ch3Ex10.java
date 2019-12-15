// CS210 Fall2019 Assignment: HW03 excercise #10 "Ch3Ex10" 
// Christopher Marvelle
// 06/OCT/2019
// Write a method called area that accepts as a parameter the radius of a circle and that returns the area of the circle.
public class Ch3Ex10{
   public static void main(String[] args){
      //parameter key; area(radius);
      //CHANGE radius for reults
      double radius = 2.0;
      System.out.println(area(radius));//just printing the returned value. fighting urge to add clarifying info in a string...
   }
   public static double area(double r){
      //formula: PI * r^2
      return Math.PI * Math.pow(r,2);
   }
}
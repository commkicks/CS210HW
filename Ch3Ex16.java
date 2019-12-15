// CS210 Fall2019 Assignment: HW03 excercise #16 "Ch3Ex16" 
// Christopher Marvelle
// 06/OCT/2019
// Write a method called triangleArea that accepts the three side lengths of a triangle as parameters and returns the area of a triangle with those side lengths.
public class Ch3Ex16{
   public static void main(String[] args){
      //parameter key; triangleArea(a,b,c); still fighting urge to add clarifying info in a string...
      System.out.println(triangleArea(8, 5.2, 7.1));
   }
   public static double triangleArea(double a,double b,double c){
      // s formula: (a + b + c)/2
      //area formula: sqrt(s * (s - a)*(s - b)*(s - c))
      double s = (a + b + c)/2;
      return Math.sqrt(s * (s - a)*(s - b)*(s - c));
   }
}
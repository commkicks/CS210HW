// CS210 Fall2019 Assignment: HW03 excercise #5 "Ch3Ex05" 
// Christopher Marvelle
// 06/OCT/2019
// Write a method called printGrid that accepts two integers representing a number of rows and columns 
// and prints a grid of integers from 1 to (rows * columns) in column major order.

public class Ch3Ex05{
   public static void main(String[] args){
      //parameter key; (row, column)
      printGrid(3, 8);
   }
   public static void printGrid(int row,int column){
      //loops "row" amount of times
      for(int line = 1; line <= row; line++){
         //declares count as an integer equal to line
         int count = line;
         System.out.print(line);
         for(int i = 2; i <= column; i++){
            //prints count with a space then increases count by row
            System.out.print(", " + (count += row));
         }
         System.out.println();
      }
   }
}
// CS210 Fall2019 Assignment: HW02 excercise #15 "Ch2Ex15" 
// Christopher Marvelle
// 29/SEPT/2019
// Write a method called "printDesign" that produces the following output. Use nested for loops to capture the structure of the figure.

public class Ch2Ex15{
   public static void main(String[] args){
      printDesign();
   }
   public static void printDesign(){
      int line = 1;
      for(int i = 1; i <= 9; i += 2){
         //print dashes 6 - i times
         for(int j = 1; j <= 6 - line; j++){
            System.out.print("-");
         }
         //prints i and loops i times
         for(int k = 1; k <= i; k++){
            System.out.print(i);
         }
         //print dashes 6 - i times
         for(int l = 1; l <= 6 - line; l++){
            System.out.print("-");
         }
         //moves to new line and increases line by 1
         System.out.println();
         line++;
      }
   }
}
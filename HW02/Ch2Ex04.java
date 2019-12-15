// CS210 Fall2019 Assignment: HW02 excercise #4 "Ch2Ex04" 
// Christopher Marvelle
// 29/SEPT/2019
// Write nested for loops to produce the requested output:

public class Ch2Ex04{
   public static void main(String[] args){
      //these loops will produce five * per line on four lines
      for (int i = 1; i <= 4; i++){
         for (int j = 1; j <= 5; j++){
            System.out.print("*");
            
         }
         //moves to next line after * loop finishes
         System.out.println();
      }
   }
}
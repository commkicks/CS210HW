// CS210 Fall2019 Assignment HW02 excercise #7 "Ch2Ex07" 
// Christopher Marvelle CS210
// 29/SEPT/2019
// Write nested for loops to produce the following output:

public class Ch2Ex07{
   public static void main(String[] args){
      // for loop will print a number of spaces equal to 5 - i.
      for(int i = 1; i <= 5; i++){
         for(int j = 1 ; j <= 5 - i; j++){
            // Replace space with "_" to test
            System.out.print(" ");
         }
         // After loops ends, prints i and then moves to the next line.
         System.out.print(i);
         System.out.println();
      }
      
   }
}
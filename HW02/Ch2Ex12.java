// CS210 Fall2019 Assignment: HW02 excercise #12 "Ch2Ex12" 
// Christopher Marvelle
// 29/SEPT/2019
// Write nested for loops to produce the following output:

public class Ch2Ex12{
   public static void main(String[] args){
      //loops three times.
      for(int i = 1; i <= 3; i++){
         //prints j three times then increases the index by one. 
         for(int j = 0; j <= 9; j++){
            //this loop prints out j three times. Practice it website requires a triple nested loop...
            for(int k = 1; k <= 3; k++){
            System.out.print(j); 
            }
         }
         System.out.println();
      }      
   }
}
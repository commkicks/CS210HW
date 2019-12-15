import java.util.*;
public class testCh5{
   public static void main(String[] args){
      Scanner console = new Scanner(System.in); //declaring new scanner object
      System.out.print("Please enter num: ");
      int low = console.nextInt();
      System.out.print("has odd: " + hasAnOddDigit(low));      
   }
   public static boolean hasAnOddDigit(int taco){
      int sum = 0;
      do{
         sum = taco % 2;
         taco = taco / 10;
      } while(taco>0);
      return sum == 0; 
   }
}
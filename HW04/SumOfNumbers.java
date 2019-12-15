import java.util.*;

public class SumOfNumbers{
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in); //declaring new scanner object
    System.out.print("Please enter the low number: ");
    int low = console.nextInt();
    System.out.print("Please enter the high number: ");
    int high = console.nextInt();
    int sum = 0;
    for (int i = low; i <= high; i++) {
      sum += i;
    }
    System.out.println("sum = " + sum);
  }
}
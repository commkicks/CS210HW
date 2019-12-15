import java.io.*; 
import java.util.*; 

public class test {
   public static void main(String[] Args){
      int[] a1 = {2, 7, 12};
      mystery(a1);
      System.out.print(Arrays.toString(a1));
   }
   public static void mystery(int[] list) {
      for (int i = 2; i < list.length; i++) {
         list[i] = list[i] + list[i - 1] + list[i - 2];
      }
   }}
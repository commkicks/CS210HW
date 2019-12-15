/*
   CS210 Fall2019 Assignment: HW08 Ex07
   Christopher Marvelle 10/NOV/2019
   
   Add the following mutator method to the TimeSpan class:
   Adds the given amount of time to this time span.
*/

import java.util.*;

public class HW08Ex07{
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      int startHr, startMin, endHr, endMin;
      TimeSpan startTime, endTime;
      
      System.out.printf("Input for HW.08 Ex.07:\nPlease enter a starting time.\nEnter hour of start time: ");
      startHr = console.nextInt();
      System.out.printf("Enter minutes of starting time: ");
      startMin= console.nextInt();
      System.out.printf("Enter the hours elapsed: ");
      endHr = console.nextInt();
      System.out.printf("Enter the minutes elapsed: ");
      endMin = console.nextInt();
      startTime = new TimeSpan(startHr,startMin);
      endTime = new TimeSpan(endHr, endMin);
      System.out.printf("Output for HW.08 Ex.07:\n" + startTime.toString() + " plus "+ endTime.toString());
      startTime.add(endTime);
      System.out.printf(" equals " + startTime.toString() + ".");
                        
   }// main
}
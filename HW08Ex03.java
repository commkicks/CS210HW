/*
   CS210 Fall2019 Assignment: HW08 Ex03 "manhattanDistance"
   Christopher Marvelle 10/NOV/2019
   Returns the “Manhattan distance” between the current Point object and the given other Point object. 
   The Manhattan distance refers to the distance between two places if one can travel between them only by moving horizontally or vertically, 
   as though driving on the streets of Manhattan. In our case, the Manhattan distance is the sum of the absolute values of the differences in their coordinates; 
   in other words, the difference in x plus the difference in y between the points.
*/

import java.util.*;

public class HW08Ex03{
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      int startPointXpos, startPointYpos, endPointXpos, endPointYpos;
      Point startPoint, endPoint;
      
      System.out.printf("Input for HW.08 Ex.03:\nPlease enter a starting point.\nEnter X positon of starting point: ");
      startPointXpos = console.nextInt();
      System.out.printf("Enter Y positon of starting point: ");
      startPointYpos = console.nextInt();
      System.out.printf("Enter X positon of end point: ");
      endPointXpos = console.nextInt();
      System.out.printf("Enter Y positon of end point: ");
      endPointYpos = console.nextInt();
      startPoint = new Point( startPointXpos, startPointYpos);
      endPoint = new Point(endPointXpos, endPointYpos);
      
      System.out.printf("Output for HW08 Ex.03\nThe distance between "+ startPoint + " and "
                        + endPoint +" is: %d", startPoint.manhattanDistance(endPoint) 
                        );
   }// main
}// HW08Ex03
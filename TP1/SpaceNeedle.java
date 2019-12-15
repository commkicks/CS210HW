// CS210 Assignment TP1 excercise #7 "SpaceNeedle" 
// Christopher Marvelle CS210
// 23/SEPT/2019
// Write a program that produces the following figure as its output using nested for loops. 
// Use a class constant to make it possible to change the size of the figure.

public class SpaceNeedle{
   // "t" will be declared as an int. CHANGE THIS TO MODIFY THE CLASS CONSTANT!!!! 
   // 4 is the textbook default. DO NOT use an int >= 50, teminal will wrap output
   public static final int scale = 4;
   // main will call methods in order
   public static void main(String[] args){
      bar();
      pyramid();
      cup();
      bar();
      base();
      pyramid();
   }
   public static void bar(){
   // for loop to repeat "scale" times
      for (int i = 1; i <= scale; i++){
         //prints spaces 8 + scale
         for (int barSpace = 1; barSpace <= (scale * 3); barSpace++){
            System.out.print(" ");
         }
         System.out.print("||");
         System.out.println();
      }
   }
   public static void pyramid(){
      // Declare spaceCount as an expression of scale. The expression is derived from the text examples base of 4
      int spaceCount = (scale * 3) - 3;
      // prints "pyramid" shape.  
      for(int i = 1; i <= scale; i++){
         //print "scaled" amount of spaces; text book example shows a decrease of 3
         for(int pyrSpace = 1; pyrSpace <= spaceCount; pyrSpace++){
            System.out.print(" ");
         }
         //print "__/"
         System.out.print("__/");
         //loop prints ":::" dependent on scale variable, "scale" amount of times
         for(int pyrDots = 0; pyrDots <= i - 2; pyrDots++){
            System.out.print(":::");
         }
         //print "||"
         System.out.print("||");
         //loop prints ":::" dependent on scale variable, "scale" amount of times
         for(int pyrDotTwo = 0; pyrDotTwo <= i - 2; pyrDotTwo++){
            System.out.print(":::");
         }
         //loop prints "\\__". then proceedes to new line
         System.out.print("\\__");//no spaces after needed
         System.out.println();
         spaceCount -= 3;
      }
      //once "body" loop is written.
      System.out.print("|");
      for(int pyrQuotes = 1; pyrQuotes <= scale; pyrQuotes++){
         System.out.print("\"\"\"");//prints (""")
      }
      for(int pyrQuotes = 1; pyrQuotes <= scale; pyrQuotes++){
         System.out.print("\"\"\"");//prints (""")
      }
      System.out.print("|");
      System.out.println();
   }
   public static void cup(){
      // Declare cupLine as an expression of scale. The expression is derived from the text examples base of 4
      int cupLine = (scale*3)-2;
      int cupSpace = 0;
      // loop to scale
      for(int cupVar = 1; cupVar <= scale; cupVar++){
         // loop to print spaces
         for(int cupIndex = 1; cupIndex <= cupSpace; cupIndex++){
            System.out.print(" ");
         }
         // start chape
         System.out.print("\\_/");      
         // print to fill shape to scale
         for(int cupscale = 1; cupscale <= cupLine; cupscale++){
               System.out.print("\\/");
         }
         // "close" shape and move to new line
         System.out.print("\\_/");
         System.out.println();
         // alter variables 
         cupLine-=2;
         cupSpace+=2;
      }
   }
   public static void base(){
   // base, uses a for loop to print "scale" times.
      for (int i = 1; i <= scale; i++){
         //will print line 4 times
         for (int x = 1; x <= scale; x++){
            //prints spaces 5 + scale
            for (int baseSpace = 1; baseSpace <= (scale * 3) - 3; baseSpace++){
               System.out.print(" ");
            }
            System.out.print("|%%||%%|");
            System.out.println();
         }
      }
   }
}

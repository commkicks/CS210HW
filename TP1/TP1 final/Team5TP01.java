// CS210 Assignment TP1 excercise #7 "Team5TP01" 
// Christopher Marvelle, Aaron Davidson, Wonjun Lee, Alex Faull, Huantong Jenny Ji, Quynh (Julie) Duong, and Youssef Ben Taleb.
// 04/OCT/2019
// Write a program that produces the following figure as its output using nested for loops. 
// Use a class constant to make it possible to change the size of the figure.

public class Team5TP01{
   // "scale" will be declared as an int. CHANGE THIS TO MODIFY THE CLASS CONSTANT.
   public static final int scale = 8;
   // main will call methods in order
   public static void main(String[] args){
      support();
      pyramid();
      topBase();
      support();
      base();
      pyramid();
   }
   // Support completed by Aaron Davidson and Wonjun Lee.
   public static void support(){
   // for loop to repeat "scale" times
      for (int i = 1; i <= scale; i++){
         // prints spaces 3 * scale
         for (int barSpace = 1; barSpace <= (scale * 3); barSpace++){
            System.out.print(" ");
         }
	 // Prints "||" and then moves to new line.
         System.out.print("||");
         System.out.println();
      }
   }
   // Pyramid completed by Julie and Christopher.
   public static void pyramid(){
      // Declare spaceCount as an expression of scale. The expression is derived from the text examples base of 4
      int spaceCount = (scale * 3) - 3;
      // prints "pyramid" shape.  
      for(int i = 1; i <= scale; i++){
         // print "scaled" amount of spaces; text book example shows a decrease of 3
         for(int pyrSpace = 1; pyrSpace <= spaceCount; pyrSpace++){
            System.out.print(" ");
         }
         // print "__/"
         System.out.print("__/");
         // loop prints ":::" dependent on scale variable, "scale" amount of times
         for(int pyrDots = 0; pyrDots <= i - 2; pyrDots++){
            System.out.print(":::");
         }
         // print "||"
         System.out.print("||");
         // loop prints ":::" dependent on scale variable, "scale" amount of times
         for(int pyrDotTwo = 0; pyrDotTwo <= i - 2; pyrDotTwo++){
            System.out.print(":::");
         }
         // loop prints "\\__". then proceedes to new line
         System.out.print("\\__");//no spaces after needed
         System.out.println();
         spaceCount -= 3;
      }
      // once "body" loop is written.
      // opens new figure with "|"
      System.out.print("|");
      for(int pyrQuotes = 1; pyrQuotes <= scale; pyrQuotes++){
         System.out.print("\"\"\"");//prints (""")
      }
      for(int pyrQuotes = 1; pyrQuotes <= scale; pyrQuotes++){
         System.out.print("\"\"\"");//prints (""")
      }
      // closes figure wiht "|" and moves to new line
      System.out.print("|");
      System.out.println();
   }
   // topBase completed by Alex Faull and Youssef Ben Taleb
   public static void topBase(){
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
   // Base completed by Jenny.Rockstar!
   public static void base(){
   // base, uses a for loop to print "scale" times.
      for(int i=1; i<=4 * scale; i++) {
         // loop prints spacing
         for(int a=1; a<=3 * scale - 3; a++) {
            System.out.print(" ");
         }
         // loop prints "|%%|" twice to produce "|%%||%%|"
         for(int b=1; b<=2; b++) {
            System.out.print("|%%|");
         }
         System.out.println();
      }
   }
}

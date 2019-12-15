public class SpaceNeedle2{
    public static int constant = 8;
        public static void main(String[] args) {
              
        upHalfTop();
        bottomline();
        }
        public static void upHalfTop() {
          for (int line = 1; line <= constant; line++) {
              for (int space = 1; space <= constant-line; space++) {
                  System.out.print("   ");
         }  
                  System.out.print("__/");
              for (int j = 1; j <= line-1; j++) {
                  System.out.print(":::");
         }
                  System.out.print("||");
          for (int j = 1; j <= line-1; j++) {
                  System.out.print(":::");
         }
                  System.out.println("\\__");
         }
     }
         public static void bottomline() {
                  System.out.print("|");
          for (int i = 1; i <= constant; i++) {
                  System.out.print("\"\"\"\"\"\"");
      }
                  System.out.println("|");
     }
 }
         
    
        
        
        

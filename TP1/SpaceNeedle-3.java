public class SpaceNeedle {
        public static void main(String[] args) {
              
        upHalfTop();
        bottomline();
        }
        public static void upHalfTop() {
        int size=4;
          for (int line = 1; line <= size; line++) {
              for (int space = 1; space <= size-line; space++) {
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
            int size=4;
                  System.out.print("|");
          for (int i = 1; i <= size; i++) {
                  System.out.print("\"\"\"\"\"\"");
      }
                  System.out.println("|");
     }
 }
         
    
        
        
        
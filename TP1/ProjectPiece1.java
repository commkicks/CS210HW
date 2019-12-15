
public class ProjectPiece1 {
    public static final int HEIGHT =4;
    
    public static void main(String[] args) 
    {      
         //Part 5
         for(int i=1; i<=4*HEIGHT; i++) {
             for(int a=1; a<=3*HEIGHT-3; a++) {
                 System.out.print("-");
                 }
             for(int b=1; b<=2; b++) {
                 System.out.print("|%%|");
                 }
             System.out.println("");
         }
     }
}
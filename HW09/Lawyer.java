// A class to represent lawyers.
public class Lawyer extends Employee {
   public Lawyer(int years) {
      super(years); //calls Employee constructor with the parameter it expects
      }
   
   public String getVacationForm() {
      return "pink";
      }
   
   public int getVacationDays() {
      return 15;
      }

   public String sue() {
      return "I'll see you in court!";
      }
   
   public String toString() {
      return "Lawyer";
      }
   }

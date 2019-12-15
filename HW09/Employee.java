// A class to represent employees in general.
public class Employee {
   private int years;
    
   public Employee(int initialYears) {
      years = initialYears;
      }
    
   public String getVacationForm() {
      return "yellow";
      }
   
   public int getHours() {
      return 40;
      }
   
   public double getSalary() {
      return 40000;
      }
   
   public int getVacationDays() {
      return 10 + 2 * years;
      }
   
   public String toString() {
      return "Employee";
      }
   }

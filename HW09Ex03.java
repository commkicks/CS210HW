/**
 * <p>CS210 Fall2019 Assignment: HW09 Ex03.
 * </p>
 * @author Christopher Marvelle 
 * @param client program to test the Employee class and subclasses.
 * @date 19/NOV/2019
 * @see Employee
 * @see Lawyer
 * @see HarvardLawyer
 */
public class HW09Ex03 {
  /**
   * checks the three classes for assignment.
   * prints text to show class function
   */
  public static void main(String[] args) {
    System.out.printf("Output for HW. 09 Ex. 03: \n#######################################\n");
    
    // Employee class check
    Employee edna = new Employee(5);
    System.out.printf("Employee: Edna\n");
    System.out.printf("\tHours:\n\t\t%d\n", edna.getHours());
    System.out.printf("\tSalary: \n\t\t$%.2f \n", edna.getSalary());
    System.out.printf("\tVacation days: \n\t\t%d\n", edna.getVacationDays());
    System.out.printf("\tVacation form: \n\t\t%s\n", edna.getVacationForm());
    System.out.printf("#######################################\n");
    
    // Lawyer Class check
    System.out.printf("Lawyer: Lucy\n"); 
    Lawyer lucy = new Lawyer(5);
    System.out.printf("\tHours:\n\t\t%d\n", lucy.getHours());
    System.out.printf("\tSalary: \n\t\t$%.2f \n", lucy.getSalary()); 
    System.out.printf("\tVacation days: \n\t\t%d\n", lucy.getVacationDays());
    System.out.printf("\tVacation form: \n\t\t%s\n", lucy.getVacationForm());
    System.out.printf("\tSue? \n\t\t %s \n", lucy.sue()); 
    System.out.printf("#######################################\n");
    
    // HarvardLawyer Class check
    System.out.printf("Harvard Lawyer: Steve\n"); 
    Lawyer steve = new HarvardLawyer(5);// worked five years 
    System.out.printf("\tHours:\n\t\t%d\n", steve.getHours());
    System.out.printf("\tSalary: \n\t\t$%.2f \n", steve.getSalary()); 
    System.out.printf("\tVacation days: \n\t\t%d\n", steve.getVacationDays());
    System.out.printf("\tVacation form: \n\t\t%s\n", steve.getVacationForm());
    System.out.printf("\tSue? \n\t\t%s\n", steve.sue()); 
    System.out.printf("#######################################\n");
    
  } //main
} //HW09Ex03

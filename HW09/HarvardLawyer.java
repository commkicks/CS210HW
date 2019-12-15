/*
 * CS210 Fall2019 Assignment: HW09 Ex03
 * Christopher Marvelle 19/NOV/2019
 * Objective:
 * Write a class HarvardLawyer to accompany the other law firm classes described in this chapter. 
 * Harvard lawyers are like normal lawyers, but they make 20% more money than a normal lawyer, 
 * they get 3 days more vacation, 
 * and they have to fill out four of the lawyer's forms to go on vacation. 
 * That is, the getVacationForm method should return "pinkpinkpinkpink". 
 * Make sure to interact with the superclass as appropriate.
 */

public class HarvardLawyer extends Lawyer {

  public HarvardLawyer(int years) {
    super(years);
  }
  
  @Override public double getSalary() {
    return (super.getSalary() * .2) + super.getSalary();
  }

  @Override public int getVacationDays() {
    return super.getVacationDays() + 3;
  }

  @Override public String getVacationForm() {
    String formColor = "";
    for (int i = 0; i < 4; i++) {
      // use the form color from the Lawyer class
      formColor += super.getVacationForm(); 
    }
    return formColor;
  }
} // HarvardLawyer

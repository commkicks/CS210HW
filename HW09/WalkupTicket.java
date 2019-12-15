/**
 * <p>CS210 Fall2019 Assignment: HW09 Ex07.
 * </p>
 * Objective:
 * Implement a class called WalkupTicket to represent a walk-up event ticket. 
 * Walk-up tickets are also constructed by number, and they have a price of $50.
 * @author Christopher Marvelle 
 * @date 19/NOV/2019
 */
public class WalkupTicket extends Ticket {
  private int number;

  public WalkupTicket(int number) {
    super(number, 0);
  }
  
  @Override public double getPrice() {
    return 50.0;
  }
} //WalkupTicket


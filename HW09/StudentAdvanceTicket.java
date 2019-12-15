/**
 * <p>CS210 Fall2019 Assignment: HW09 Ex08.
 * </p>
 * Objective:
 * Implement a class called StudentAdvanceTicket.
 * A student advance ticket is constructed with 
 *  - a ticket number and with the number of days in advance that the ticket was purchased. 
 * NOTE:
 * - Student advance tickets purchased 10+ days before the event cost 1/2 normal advance ticket.
 * - Student advance tickets purchased <10 days before the event cost 1/2 normal advance ticket. 
 * - when student advance ticket is printed: 
 *   - the String should mention that the student must show student ID.
 *      - (for example, "Number: 17, Price: 15.0 (ID required)").
 * @author Christopher Marvelle 
 * @date 19/NOV/2019
 */
public class StudentAdvanceTicket extends AdvanceTicket {
  private int number;
  private int dayBeforeEvent;
  
  public StudentAdvanceTicket (int castNumber, int castDayBeforeEvent) {
    super(castNumber, castDayBeforeEvent);
    number = castNumber;
    dayBeforeEvent = castDayBeforeEvent;
  }
  
  @Override public double getPrice() {
    if (dayBeforeEvent >= 10) {
      return super.getPrice() / 2;
    } else if (dayBeforeEvent < 10 && dayBeforeEvent != 0) {
      return super.getPrice() / 2;
    } else {
      return 50; // catch day of ticket prices
    }
  }
  
  @Override public String toString() {
    return "Number: " + number + ", Price: $" + this.getPrice() + " (ID required)";
  }
} //AdvanceTicket


/**
 * <p>CS210 Fall2019 Assignment: HW09 Ex07
 * </p>
 * @author Christopher Marvelle 
 * @date 19/NOV/2019
 * Objective:
 * Implement a class called "AdvanceTicket" to represent tickets purchased in advance. 
 * An advance ticket constructed with:
 * - a ticket number
 * - The number of days in advance that the ticket was purchased.
 * Note: 
 * - Advance tickets purchased 10 or more days before the event cost $30, 
 * - Advance tickets purchased fewer than 10 days before the event cost $40.
 */
public class AdvanceTicket extends Ticket {
  private int number;
  private int dayBeforeEvent;
  
  public AdvanceTicket (int castNumber, int castDayBeforeEvent) {
    super(castNumber, castDayBeforeEvent);
    number = castNumber;
    dayBeforeEvent = castDayBeforeEvent;
  }
  
  @Override public double getPrice() {
    if (dayBeforeEvent >= 10) {
      return 30;
    } else if (dayBeforeEvent < 10) {
      return 40;
    } else {
      return 50;
    } //if else
  }
} //AdvanceTicket

/**
  * <p>CS210 Fall2019 Assignment: HW09 Ex05.
  * </p>
  * ####
  * Objective:
  * Implement a class called Ticket that will serve as the superclass for three tickets. 
  * Define all common operations in this class, 
  * specify all differing operations in such a way that every subclass must implement them. 
  * ####
  * No actual objects of type Ticket will be created: 
  *  - Each actual ticket will be an object of a subclass type. 
  * ####
  * Define the following operations:
  *  - The ability to construct a ticket by number. 
  *  - The ability to ask for a ticket’s price. 
  *  - The ability to println a ticket object as a String.
  *    - An example String would be "Number: 17, Price: 50.0".
  * ####
  * @author Christopher Marvelle 
  * @date 19/NOV/2019
  */
public abstract class Ticket {
  private int number;
  private int dayBeforeEvent;
  
  public Ticket(int number, int dayBeforeEvent) { 
    this.number = number;
    this.dayBeforeEvent = dayBeforeEvent;
  }
  
  public double getPrice() {
    return 0;
  }

  public String toString() {
    return "Number: " + number + ", Price: $" + this.getPrice();
  }
} // Ticket

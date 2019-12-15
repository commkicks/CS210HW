/**
 * <p>CS210 Fall2019 Assignment: HW09 Ex0. - 08.
 * </p>
 * @author Christopher Marvelle
 * @param client program to test the Employee class and subclasses.
 * @date 19/NOV/2019
 * @see Ticket
 * @see WalkupTicket
 * @see AdvanceTicket
 * @see StudentAdvanceTicket
 */
public class HW09Ex05to08 {
  /**
   * checks the three classes for assignment.
   * prints text to show class function
   */
  public static void main(String[] args) {
    System.out.printf("Output for HW. 09 Ex. 05 - 08: \n#######################################\n");
    
    // walk-up ticket class check
    WalkupTicket walkUp = new WalkupTicket(1);
    System.out.printf("Walk-up ticket:\n%s\n",walkUp.toString());
    
    // AdvanceTicket class check one
    AdvanceTicket advTicket = new AdvanceTicket(2, 11);
    System.out.printf("\nAdvance ticket more than 10 days:\n%s\n",advTicket.toString());
    
    // AdvanceTicket class check two
    AdvanceTicket advTicketTwo = new AdvanceTicket(3, 9);
    System.out.printf("\nAdvance ticket less than 10 days:\n%s\n",advTicket.toString());
    
    // StudentAdvanceTicket ticket class check one
    StudentAdvanceTicket stdAdvTicket = new StudentAdvanceTicket(4,11);
    System.out.printf(
        "\nStudent advance ticket more than 10 days ticket:\n%s\n",stdAdvTicket.toString()
    );
        
    // StudentAdvanceTicket ticket class check two
    StudentAdvanceTicket stdAdvTicketTwo = new StudentAdvanceTicket(5,9);
    System.out.printf(
        "\nStudent advance ticket less than 10 days ticket:\n%s\n",stdAdvTicketTwo.toString()
    );
    
    System.out.printf("#######################################\n");
  }
}
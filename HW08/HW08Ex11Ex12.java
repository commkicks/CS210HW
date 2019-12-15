/*
   CS210 Fall2019 Assignment: HW08 Ex11 & 12 
   Christopher Marvelle 10/NOV/2019  
   ex11: 
   Add a field to the BankAccount class named transactionFee for a real number representing an amount of money to deduct every time the user withdraws money. 
   The default value is $0.00, but the client can change the value. Deduct the transaction fee money during every withdraw call (but not from deposits).
   Make sure that the balance cannot go negative during a withdrawal. If the withdrawal (amount plus transaction fee) would cause it to become negative,
   don’t modify the balance at all.
   ex12:
   Add a toString method to the BankAccount class from the previous exercise. 
   Your method should return a string that contains the account’s name and balance separated by a comma and space. 
   For example, if an account object named yana has the name "Yana" and a balance of 3.03, the call yana.toString() should return the string "Yana, $3.03".
*/
import java.util.*;
public class HW08Ex11Ex12{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String name;
		System.out.printf("Input for HW.08 Ex.11:\nPlease enter the name for the account: ");
		name = console.next();
		System.out.printf("Enter the balance: ");
		BankAccount savings = new BankAccount(name, console.nextDouble());
		System.out.printf("Enter how many withdrawls you wish to make: ");
		int transactionCount = console.nextInt();
		for(int i = 1; i <= transactionCount; --transactionCount){
			System.out.printf("Enter amount to withdraw: ");
			savings.withdraw(console.nextInt());
		}
		System.out.printf("Enter the Transaction fee: ");
		savings.transactionFee(console.nextDouble());
		// demonstrates excercise 12 with this output
		System.out.printf(
			"Output for HW.08 Ex.11\naccount information is: " 
			+ savings.toString() + "\n"
			);
	}// main
}


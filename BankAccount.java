/*
 * CS210 Fall2019 Assignment: HW08 Ex11,12,13
 * Christopher Marvelle 10/NOV/2019
 * Bank account class for problem 11, chapter 8 of BJP4
 * Taken from the text.
 * Each BankAccount object represents one user's account information including name and balance of money.
 */

public class BankAccount {
	// Edit made data "private" and add "transactions"
	private String name;
	private double balance;
	// add counter for transactions...name used cause practice-it >_>
	private int transactions; 

	// ### Taken from practice it as timesaver ###
	@stolen_code public BankAccount(String actName, double actBalance){
		name = actName;
		balance = actBalance;
	}

	public void deposit (double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
		//pre-increment transactions
		++transactions; 
	}

/* 
 * HW08Ex11 transactionFee:    
 * Add a field to the BankAccount class named transactionFee for a real number representing an amount of money to deduct every time the user withdraws money. 
 * The default value is $0.00, but the client can change the value. Deduct the transaction fee money during every withdraw call (but not from deposits). 
 * Make sure that the balance cannot go negative during a withdrawal. 
 * If the withdrawal (amount plus transaction fee) would cause it to become negative, don’t modify the balance at all.
 */
	public boolean transactionFee(double fee) {
		double deduction = 0.0;
		// for every transaction, process the fee
		for (int withdrawCount = 1; withdrawCount <= transactions; ++withdrawCount) {
			deduction += withdrawCount * fee;
		}
		// if/ese to check for overdraft
		if (deduction < balance){
			balance -= deduction;
			return true;
		}else{    
			balance = 0.0;
			return false;
		}
	}//method

/* HW08Ex12 toString:
 * our method should return a string that contains the account’s name and balance separated by a comma and space.
 */
	public String toString() {
		if (balance > 0) {
			// if balance is positive, $%.2f to format to $0.00
			return String.format("%s, $%.2f", name, balance);
		} else  if (balance < 0) {
			// if balance goes negative, Math.abs(balance) or -balance to remove symbology
			return String.format("%s, -$%.2f", name, Math.abs(balance) );
		} else {
			return name + ", $0.00";
		}
	}//method

/* 
 * HW08Ex13 transfer:   
 * Your method should move money from the current bank account to another account. 
 * The method accepts two parameters: a second BankAccount to accept the money, and a real number for the amount of money to transfer.
 */
	public void transfer(BankAccount accountName, double transferAmnt) {
		if (transferAmnt >= 5) {
				this.balance -= 5;
			if (this.balance >= transferAmnt) {
				accountName.balance += transferAmnt;
				this.balance -= transferAmnt;
			} else if (this.balance - 5 < transferAmnt) {
				accountName.balance += this.balance;
				this.balance = 0;
			}
			//pre-increment
			++this.transactions;
			++accountName.transactions;
		}
	}
}// end class

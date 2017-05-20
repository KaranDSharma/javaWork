package APClass;

import java.util.Date;
/*
 * preconditions: accepts only integer account number
 * 
 * postconditions: returns boolean false if withdrawn within overdraft limit; else true
 */
public class CheckingAccount extends Account
{
	private int overdraftLimit;
	
	public CheckingAccount( int accountNumber, double balance, double rate, Date date, int limit)
	{
		super(accountNumber, balance, rate, date);
		overdraftLimit = limit;
	}
	
	public boolean withdraw(double amt)
	{
		if ((super.getBalance() + overdraftLimit) >= amt) 
		{
			super.setBalance(super.getBalance() - amt);
			return true;
		} else
		{
			return false;
		}
		
	}
	
	public void deposit(double amt)
	{
		super.setBalance(super.getBalance() + amt);
	}

	public int getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(int overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
}

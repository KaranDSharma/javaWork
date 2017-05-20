package APClass;

import java.util.Date;
/*
 * preconditions: accepts only integer account number
 * 
 * postconditions: returns boolean false if withdrawn within balance limit; else true
 */
public class SavingsAccount extends Account
{
	public SavingsAccount( int accountNumber, double d, double e, Date date)
	{
		super(accountNumber, d, e, date);
	}
	
	public boolean withdraw(double amt)
	{
		if (super.getBalance() <= amt)
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
	
	
}

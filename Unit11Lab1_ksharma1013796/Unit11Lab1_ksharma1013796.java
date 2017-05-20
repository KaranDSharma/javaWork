package APClass;

import java.util.Date;

public class Unit11Lab1_ksharma1013796 
{
	public static void main(String args [])
	{	
		@SuppressWarnings("deprecation")
		SavingsAccount s = new SavingsAccount(123, .0, 2.5, new Date(2015, 1, 1));
		@SuppressWarnings("deprecation")
		CheckingAccount c = new CheckingAccount(124, .0, 5.0, new Date(2015, 2, 1), 1000);
		
		s.deposit(100);
		s.deposit(2000);
		c.deposit(101);
		c.deposit(2001);
		System.out.println("Saving account number: " + s.getAccountNumber() + " Date opened: " + s.getDate() + " Balance: " + s.getBalance());	
		System.out.println("Checking account number: " + c.getAccountNumber() + " Date opened: " + c.getDate() + " Balance: " + c.getBalance());	
		s.withdraw(22);
		s.withdraw(47);
		if (c.withdraw(2000) == false) 
		{
			System.out.println("Transaction Failed !!!");
		};
		if (c.withdraw(2000) == false) 
		{
			System.out.println("Transaction Failed !!!");
		}
		System.out.println("Saving account number: " + s.getAccountNumber() + " Date opened: " + s.getDate() + " Balance: " + s.getBalance());	
		System.out.println("Checking account number: " + c.getAccountNumber() + " Date opened: " + c.getDate() + " Balance: " + c.getBalance());	
	}
}

package APClass;

import java.util.Date;
/*
 * preconditions: accepts only integer account number
 * 
 * postconditions: ø
 */
public abstract class Account 
{
	private int accountNumber;
	private double balance;
	private double rate;
	private Date date;
	
	public Account(int acct, double d2, double e, Date d)
	{
		accountNumber = acct;
		balance = d2;
		rate = e;
		date = d;
	}
	
	public abstract boolean withdraw(double amt);
	public abstract void deposit(double amt);
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}

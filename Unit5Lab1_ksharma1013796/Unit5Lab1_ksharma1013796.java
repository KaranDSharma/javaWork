import java.util.Scanner;


public class Unit5Lab1_ksharma1013796 
{
	public static void main(String args[])
	{
		double formula1; //Future Value of a Single Sum
		double formula2;
		double formula3;
		double P; //dollars
		double i; //periodic interest rate
		double n; //number of years
		double F; //final amount
		int input;
		
		Scanner  PIR = new Scanner( System.in );
		System.out.println("Please enter a percent interest rate.");
		i = PIR.nextInt();
		i = i/100;
		
		Scanner  years = new Scanner( System.in );
		System.out.println("Please enter a number of months.");
		n = years.nextInt();
		n = n/12;
		System.out.println("That is " + n + " year(s)!");

		Scanner  user = new Scanner( System.in );
		System.out.print("What would you like to calculate? Future Value of a single Sum(1), Present Value of a Single Sum(2), or Future Value of an Annuity(3)?");
		input = user.nextInt();
		
		while(true)
		{
			if(input == 1)
			{
				
				Scanner  dollars = new Scanner( System.in );
				System.out.println("Please enter a dollar value.");
				P = dollars.nextInt();
				
				formula1 = (P * Math.pow(1+i, n));
				System.out.println("You will have " + formula1);
				formula1 = Math.round(formula1 * 100.0) / 100.0;
				System.out.println("To the nearest penny that is " + formula1);
				break;
			}
			else if(input == 2)
			{
				Scanner  interest = new Scanner( System.in );
				System.out.println("Please enter the amount you would like in the end.");
				F = interest.nextInt();
				
				formula2 = F/(Math.pow(1+i, n));
				System.out.println("You must invest " + formula2);
				formula2 = Math.round(formula2 * 100.0) / 100.0;
				System.out.println("To the nearest penny that is " + formula2);
				break;
			}
			else if(input == 3)
			{
				Scanner  dollars = new Scanner( System.in );
				System.out.println("Please enter a dollar value.");
				P = dollars.nextInt();
				
				formula3 = (P * (((Math.pow(1+i, n))-1)/i));
				System.out.println("You will have " + formula3);
				formula3 = Math.round(formula3 * 100.0) / 100.0;
				System.out.println("To the nearest penny that is " + formula3);
				break;
			}
			else if(input < 1 | input > 3)
			{
				System.out.println("That is not an option.");
				break;
			}
		}
	}

}

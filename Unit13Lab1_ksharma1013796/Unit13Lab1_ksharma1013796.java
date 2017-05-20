package APClass;

import java.util.Scanner;

public class Unit13Lab1_ksharma1013796 
{
	private static Scanner denom;
	public static void main(String args [])
	{
		int x;
		denom = new Scanner( System.in);
		while (true)
		{
			System.out.print("Enter a value for the denominator.");
			x = denom.nextInt();
			
			System.out.println();
			try
			{
				divide(10, x);
			}
			catch (DivideByZeroException e)
			{
				System.out.println("Try again.");
				continue;
			}
			break;
		}
	}
	public static int divide(int x, int y) throws DivideByZeroException
	{
		int result = 0;
		try
		{
			result = x / y;
		}
		catch (ArithmeticException e)
		{
			throw new DivideByZeroException(y);
		}
		return result;
	}
}

package APClass;

public class IllegalArgumentExceptionThrown 
{
	public static void main(String args [])
	{
		int x = 200;
		try 
		{
			test(x);
		}
		catch (IllegalArgumentException e)
		{
			System.out.println("Illegal Argument Exception Thrown.");
		}
	}
	
	public static void test(int percent)
	{
		if (percent > 100)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			System.out.print(percent + "%");
		}
	}
}

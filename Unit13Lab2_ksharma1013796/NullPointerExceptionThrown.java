package APClass;

public class NullPointerExceptionThrown 
{
	public static void main(String args [])
	{
		try
		{
			test("");
		}
		catch (NullPointerException e)
		{
			System.out.println("Null pointer exception caught!");
		}
		
	}
	
	public static void test(String x)
	{
		if (x == "")
		{
			throw new NullPointerException();
		}
		else
		{
			System.out.println(x);
		}
	
	}
}

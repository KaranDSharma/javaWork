package APClass;

public class ArrayIndexOutOfBoundsExceptionThrown 
{
	public static int [] x = {10, 20, 30, 40, 50};
	
	public static void main(String args [])
	{
		try
		{
			test(5);
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Array Index Out Of Bounds Exception Thrown!");
		}
	}
	public static void test(int index)
	{
		if ( index > x.length)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		else
		{
			System.out.println(x[index]);
		}
	
	}
}

package APClass;

public class Unit16Lab2_ksharma1013796
{
	static int numCalls;
	public static int fibonacci(int n)
	{
		numCalls++;
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
		{
			return (fibonacci(n-1) + fibonacci(n-2));
		}
	}
	
	public static void main(String args [])
	{
		long t1;
		long t2;
		int val;
		for (int i = 0; i < 20; i++)
		{
			t1 = System.currentTimeMillis();
			numCalls = 0;
			val = fibonacci(i);
			t2 = System.currentTimeMillis();
			System.out.println("Time: " + (t2-t1) + " msec " + " Num Recursive Calls: " + numCalls + " Value: " + val + " ");
		}
	}	
}

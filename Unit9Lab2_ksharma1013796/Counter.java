package APClass;


public class Counter
{
    int myCount;

    public Counter()
    {
    	myCount = 0;
    }

    public Counter(int value)
    {
    	myCount = value;
    }

    public int getValue()
    {
    	return myCount;
    }

    public void setValue(int i)
    {
    	myCount = i;
    }

    public void increment()
    {
    	myCount++;
    } 
    
    public void decrement()
    {
    	myCount--;
    } 
    
    public String toString()
    {
    	return ""+myCount;
    }
    
}


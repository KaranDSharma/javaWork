package APClass;
/*
 * Precondition: Default constructors used
 * 
 * Postcondition: Alters variable memcnt
 */
public class MemoryCounter extends Counter
{
	private int memcnt;
	
	public void incrementMem()
	{
		memcnt += this.getValue();
	}
	
	public void clearMem()
	{
		memcnt = 0;
	}
	
	public int getMem()
	{
		return memcnt;
	}
	
}

package APClass;
/*
 * precondition: implements interface class
 * 
 * postcondition: prints interface methods
 */
public class Animal implements AllActions
{
	private String name;

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public void playSound() 
	{
		System.out.println("Animal Sound");
	}

	@Override
	public void resizeObject() 
	{
		System.out.println("Resizing an Animal");
	}

	@Override
	public void rotateObject() 
	{
		System.out.println("Rotating an Animal");	
	}
	
	@Override
	public void drawObject()
	{
		System.out.println("Drawing an Animal");
	}
}

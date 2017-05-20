package APClass;
/*
 * precondition: implements interface class
 * 
 * postcondition: prints interface methods
 */
public class Vehicle implements AllActions
{
	private String name;
	private int age;
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	@Override
	public void playSound() {
		System.out.println("Vehicle Sound");
	}
	
	@Override
	public void resizeObject() {
		System.out.println("Resizing a Vehicle");
	}
	
	@Override
	public void rotateObject() 
	{
		System.out.println("Rotating a Vehicle");
	}
	
	@Override
	public void drawObject() {
		System.out.println("Drawing a Vehicle");
	}
}


public class Rectangle
{
	
	private int length;
	private int width;
			
	public Rectangle(int l, int w)
	{
		if ((l > 30) | (l < 1))
		{
			
			System.out.println("Enter a length value in the range of 1-30!");
			System.exit(0);
		}
		else
			length = l;
		if ((w > 30) | (w < 1))
		{
			System.out.println("Enter a width value in the range of 1-30!");
			System.exit(0);
		}
		else
			width = w;
	}
	
		
	public void drawRectangle(char c)
	{
		for (int i = 0; i < length; i++)
			System.out.print(c);
		System.out.println("");
		for (int i = 0; i < width - 2; i++)
		{
			System.out.print(c);
			for (int j = 0; j < (length-2); j++)
				System.out.print(" ");
			System.out.println(c);
		}
		for (int i = 0; i < length; i++)
			System.out.print(c);
	}
	
	public int getLength()
	{
		return length;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int calculateArea()
	{
		return width*length;
	}
	
	public int calculatePerimeter()
	{
		return (2*length)+(2*width);
	}
		
}


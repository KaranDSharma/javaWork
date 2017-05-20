import java.util.Scanner;


public class TestRectangle 
{
	public static void main(String [] args)
	{
		
		int length;
		int width;
		char x;
		
		Scanner  l = new Scanner( System.in );
		System.out.print( "\nEnter rectangle length between 1 and 30." );
		length = l.nextInt();
		Scanner  w = new Scanner( System.in );
		System.out.print( "\nEnter rectangle width between 1 and 30." );
		width = w.nextInt();
		Scanner  ch = new Scanner( System.in );
		System.out.print( "\nEnter a character to draw the rectangle." );
		x = ch.next().charAt(0);
		
		Rectangle r1 = new Rectangle(length,width);
		r1.drawRectangle(x);
		System.out.println("\nThe area of the rectangle with length " + 
				r1.getLength() + " and width " + r1.getWidth() + " is: " + r1.calculateArea());
		System.out.println("\nThe perimeter of the rectangle with length " + 
				r1.getLength() + " and width " + r1.getWidth() + " is: " + r1.calculatePerimeter());
	
	}
}

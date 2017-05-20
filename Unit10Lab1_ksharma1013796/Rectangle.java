package APClass;

 public class Rectangle
 {
   private double length;
   private double width;
   
   public Rectangle()
   {
     length = 0;
     width = 0;
   }
   
   public Rectangle( double l, double w )
   {
     length = l;
     width = w;
   }
   
   public void setLength( double l )
   {
     length = l;
    while (true)
    {
	 	if (length < 0)
		{
			System.out.print("Nope. ");
			continue;	
		}
	 	else
	 		break;
    }	
   }
   
   public void setWidth( double w )
   {
     width = w;
     while (true)
     {
 	 	if (width < 0)
 		{
 			System.out.print("Nope. ");
 			continue;	
 		}
 	 	else
 	 		break;
     }
   }
   
   public void setSides( double l, double w )
   {
     length = l;
     width = w;
   }
   
   public double getLength()
   {
     return length;
   }
   
   public double getWidth()
   {
     return width;
   } 
   
 }
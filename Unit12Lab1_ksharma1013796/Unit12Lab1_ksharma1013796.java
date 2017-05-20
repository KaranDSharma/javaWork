package APClass;

import java.util.ArrayList;
import java.util.Random;

public class Unit12Lab1_ksharma1013796 
{
	public static void main(String args [])
	{
		ArrayList<GroceryItem> lessOrEqualSeven = new ArrayList<GroceryItem>();
		ArrayList<GroceryItem> greaterSeven = new ArrayList<GroceryItem>();		
		long rnSeed = 100;
		
		Random rnGenerator = new Random( rnSeed );
		
		for (int i = 0; i < 50; i++)
		{
			int shelfLife;
			
			GroceryItem g = new GroceryItem();
			
			g.setItemCode(i);
			
			shelfLife = rnGenerator.nextInt( 30 ) + 1;
			g.setShelfLife(shelfLife);

			if (shelfLife <= 7)
				lessOrEqualSeven.add(g);
			else 
				greaterSeven.add(g);
		}
		System.out.println("Grocery items less or equal to seven days: ");
		for (int i = 0; i < lessOrEqualSeven.size(); i++)
		{
			GroceryItem ref = lessOrEqualSeven.get(i);
			System.out.println("Item code: " + ref.getItemCode() + " Shelf life: " + ref.getShelfLife());
		}
		
		System.out.println("\n\nGrocery items greater than seven days: ");
		for (int i = 0; i < greaterSeven.size(); i++)
		{
			GroceryItem ref = greaterSeven.get(i);
			System.out.println("Item code: " + ref.getItemCode() + " Shelf life: " + ref.getShelfLife());
		}

	}
}

import java.util.Scanner;
/**
 * Calculates max/min/average/total for a given data set.
 * @author Karan Sharma
 * @version 1.0
 * 
 */

public class Unit6Lab2_ksharma1013796 
{
	public static void main(String [] args)
	{
		int numProducts;
		int numUnits;
		while (true)
		{
			Scanner  value = new Scanner( System.in );
			System.out.print( "\nPlease enter a number of products: ");
			numProducts = value.nextInt();
			if ((numProducts < 0))
			{
				System.out.print("Pick a positive number of products.");
				continue;
			}
			break;
		}
		
		int unitSold[][] = new int [numProducts][12];
		for (int i=0; i<numProducts; i++)
		{
			for (int j=0; j<12; j++)
			{
				while (true)
				{
					Scanner  value = new Scanner( System.in );
					System.out.print("\nPlease enter the units sold for product " + (i+1) + " during month " + (j+1));
					numUnits = value.nextInt();
					if ((numUnits < 1))
					{
						System.out.print("Pick a positive number of units sold.");
						continue;
					}
					unitSold[i][j] = numUnits;
					break;
				}
			}
		}
		for (int k=0; k<numProducts; k++)
		{
			System.out.println("Total units sold for product " + (k+1) + ": " + getTotal(unitSold[k]));
			System.out.println("Minimum units sold for product " + (k+1) + ": " + getMinimum(unitSold[k]));
			System.out.println("Maximum units sold for product " + (k+1) + ": " + getMaximum(unitSold[k]));
			System.out.println("Average units sold for product " + (k+1) + ": " + getAverage(unitSold[k]));

			
		//	for (int m=0; m<12; m++ )
		//		System.out.println("Product:" + (k+1) + " Month:" + (m+1) + " Units sold:" + unitSold[k][m]);
		}
		for (int k=0; k<12; k++)
		{
			int [][] temp = new int [12][numProducts];
			
			for (int i=0; i < numProducts ;i++)
				temp[k][i] = unitSold[i][k];
			System.out.println("Total units sold for month " + (k+1) + ": " + getTotal(temp[k]));
			System.out.println("Minimum units sold for month " + (k+1) + ": " + getMinimum(temp[k]));
			System.out.println("Maximum units sold for month " + (k+1) + ": " + getMaximum(temp[k]));
			System.out.println("Average units sold for month " + (k+1) + ": " + getAverage(temp[k]));
		}
	}
	
	public static int getTotal( int [] array )
	{
		int total = 0;
		for (int i=0; i<array.length; i++)
			total += array[i];
		return total;
	}
	
	public static int getMinimum( int [] array ) 
	{
		int min = array[0];
		for (int i=0; i<array.length; i++)
			if (min > array[i])
				min = array[i];
		return min;
	}
	
	public static int getMaximum( int [] array ) 
	{
		int max = array[0];
		for (int i=0; i<array.length; i++)
			if (max < array[i])
				max = array[i];
		return max;
	}
	
	public static int getAverage( int [] array )
	{
		return (getTotal(array)/array.length);
	}
}

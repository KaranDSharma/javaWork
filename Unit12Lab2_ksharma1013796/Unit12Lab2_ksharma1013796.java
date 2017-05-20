package APClass;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Unit12Lab2_ksharma1013796 
{
	int userinput;
	LinkedList<Jobs> list = new LinkedList<Jobs>();
	long rnSeed = 100;
	Random rnGenerator = new Random( rnSeed );
	
	if(true)
	{
		Scanner  input = new Scanner( System.in );
		System.out.print( "Add a job? Enter 1. Quit? Enter 2." );
		
		userinput = input.nextInt();
		int printTime = rnGenerator.nextInt( 1000 ) + 10;
	}

}

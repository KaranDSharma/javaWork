package APClass;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ContactList 
{

	private static Scanner scan;

	public static void main(String args [])
	{
		TreeMap< String, Contact > cList = new TreeMap< String, Contact >();
		String in;
		String fileName;
		scan = new Scanner( System.in );
		
		System.out.print( "Enter a file name to store contact: " );
		fileName = scan.next();
		
		while (true)
		{

			System.out.print( "(A)dd a contact? \n(D)elete a contact? \n(L)ist the contacts? \n(Q)uit?" );
			in = scan.next();
			

			switch (in)
			{
				case "a":
				case "A":
					String fnameInput; //for user input
					String lnameInput;
					String pNumber;
					String email;
					
					Scanner  s1 = new Scanner( System.in );
					System.out.print( "Please input contact first name. " );
					fnameInput = s1.nextLine();
					
					Scanner  s2 = new Scanner( System.in );
					System.out.print( "Please input contact last name. " );
					lnameInput = s2.nextLine();
					
					Scanner  s3 = new Scanner( System.in );
					System.out.print( "Please input contact phone number. " );
					pNumber = s3.nextLine();
					
					Scanner  s4 = new Scanner( System.in );
					System.out.print( "Please input contact email. " );
					email = s4.nextLine();
					
					Contact c1 = new Contact(fnameInput, lnameInput, pNumber, email);
					System.out.println("Adding: " + c1.getlName());
					
					cList.put(c1.getlName(), c1);
					break;
					
				case "D":
				case "d":
					Scanner  s5 = new Scanner( System.in );
					System.out.print( "Please input contact last name. " );
					lnameInput = s5.nextLine();
					cList.remove(lnameInput);
					break;
					
				case "Q":
				case "q":
			        try {
			            // Assume default encoding.
			            FileWriter fileWriter =
			                new FileWriter(fileName);

			            // Always wrap FileWriter in BufferedWriter.
			            BufferedWriter bufferedWriter =
			                new BufferedWriter(fileWriter);
			            
						for (Map.Entry<String, Contact> cl : cList.entrySet())
						{
							Contact c = cList.get(cl.getKey());
							bufferedWriter.write("First Name: " + c.getfName());
							bufferedWriter.newLine();	
							
							bufferedWriter.write("Last Name: " + c.getlName());
							bufferedWriter.newLine();	
							
							bufferedWriter.write("Phone Number: " + c.getPhoneNumber());
							bufferedWriter.newLine();	
							
							bufferedWriter.write("Email Address: " + c.getEmailAddress());
							bufferedWriter.newLine();
							bufferedWriter.newLine();	
							bufferedWriter.newLine();								
						}
			            // Always close files.
			            bufferedWriter.close();
			        }
			        catch(IOException ex) {
			            System.out.println(
			                "Error writing to file '"
			                + fileName + "'");
			        }
					System.exit(0);
					
				case "L":
				case "l":
					for (Map.Entry<String, Contact> cl : cList.entrySet())
					{
						Contact c = cList.get(cl.getKey());
						System.out.println("First Name: " + c.getfName() + " Last Name: " + c.getlName() + " Phone Number: " + c.getPhoneNumber() + " Email Address: " + c.getEmailAddress());
					}
					break;
					
				default:
					break;
			}
		}
	}
}

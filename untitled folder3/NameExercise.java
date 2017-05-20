import javax.swing.JOptionPane;


public class NameExercise 
{
	public static void main(String args [])
	{
		Name name = new Name("Tony", "Baggadonuts");
		/*
		  * Precondition: First name set to Tony, Last set to Baggadonuts
		  * 
		  * Postcondition: None
		  */
		Date date = new Date( 10, 21, 2001);
		/*
		  * Precondition: Date set to 10/21/2001
		  * 
		  * Postcondition: None
		  */
		JOptionPane.showMessageDialog( null, "Name: " + name.getFirstName() + " " + 
				name.getLastName() + "\n" + "Birthdate: " + date.getDateString());
		/*
		  * Precondition: Accepts only strings, Accepts only positive integers, No checks are made for valid 
		  * month, date, or year range
		  * 
		  * Postcondition: None
		  */
	}
	
}

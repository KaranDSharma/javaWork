public class Person
{
	private Date birthDay;
	private Name name;
	
	 public String getBirthDayString()
	 {
		 return birthDay.getDateString();
	 }
	 
	 /*
	  * Precondition: Accepts only positive integers, No checks are made for valid 
	  * month, date, or year range
	  * 
	  * Postcondition: Returns birth date
	  */
	 public Person( Name na, Date bd )
	 {
		 name = na;
		 birthDay = bd;
	 }
	 
	 public Person() // Default constructor
	 {
		 name = new Name("None","None");
		 birthDay = new Date( 99, 99, 9999 );
	 }
	 /*
	  * Precondition: None
	  * 
	  * Postcondition: Returns name set to None None and date as 99/99/9999
	  */
} 
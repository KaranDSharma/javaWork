
public class Name 
{
	private String name;
	private String lastName;
	
	public Name()
	{
		name = "";
		lastName = "";
	} /*
	  * Precondition: None
	  * 
	  * Postcondition: name and lastName are set to null
	  */
	
	public Name( String n, String ln)
	{
		name = n;
		lastName = ln;
	}
	 /*
	  * Precondition: Accepts only strings
	  * 
	  * Postcondition: None
	  */
	
	public String getFirstName() 
	{
		return name;
	}
	 /*
	  * Precondition: Accepts only strings
	  * 
	  * Postcondition: None
	  */
	
	public String getLastName()
	{
		return lastName;
	} 
	/*
	  * Precondition: Accepts only strings
	  * 
	  * Postcondition: None
	  */
}

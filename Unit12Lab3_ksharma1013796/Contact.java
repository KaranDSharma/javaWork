package APClass;
/*
 * precondition: creates setter and getter methods for string variables
 * 
 * postcondition: assigns values to string variables
 */
public class Contact 
{
	private String fName;
	private String lName;
	private String phoneNumber;
	private String emailAddress;
	
	public Contact(String f, String l,String p, String e)
	{
		fName = f;
		lName = l;
		phoneNumber = p;
		emailAddress = e;
	}
	
	public String getfName() 
	{
		return fName;
	}
	public void setfName(String fName)
	{
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) 
	{
		this.lName = lName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress)
	{
		this.emailAddress = emailAddress;
	}
	
}

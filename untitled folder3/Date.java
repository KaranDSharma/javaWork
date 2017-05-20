public class Date 
{
	 private int month;
	 private int day;
	 private int year;
	 
	 /*
	  * Precondition: Accepts only positive integers, No checks are made for valid 
	  * month, date, or year range
	  * 
	  * Postcondition: None
	  */
	 public Date( int m, int d, int y )
	 {
		 month = m;
		 day = d;
		 year = y;
	 }
	 public String getDateString()
	 {
		return month + "/" + day + "/" + year;
	 }
	 
	 /*
	  * Precondition: Accepts only positive integers, No checks are made for valid 
	  * month, date, or year range
	  * 
	  * Postcondition: returns month date and year separated by slashes.
	  */
} 
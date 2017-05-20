// Fig. 8.5: Time2.java
// Time2 class declaration with overloaded constructors.  

public class Time2
{
   private int second; // 0 - 86399 = 24Hrs

   // Time2 no-argument constructor: initializes each instance variable
   // to zero; ensures that Time2 objects start in a consistent state  
   public Time2()                                                      
   {                                                                   
	   second = 0;
   } // end Time2 no-argument constructor                              


   // Set Methods
   // set a new time value using universal time; ensure that 
   // the data remains consistent by setting invalid values to zero
   public void setTime( int h, int m, int s )
   {
      second = h*60*60 + m*60 + s;
   } // end method setTime

  // validate and set hour                   
   public void setHour( int h )               
   {     
	   int hour = second/(60*60);
	   int rem = second - (hour*60*60);
	   
	   hour = ( ( h >= 0 && h < 24 ) ? h : 0 );
	   second = rem + (hour*60*60);
   } // end method setHour                    

   // validate and set minute                   
   public void setMinute( int m )               
   {         
	   int hour = second/(60*60);
	   int min = (second%(60*60))/60;	   
	   int sec = (second%(60*60))%60;
	   
       int minute = ( ( m >= 0 && m < 60 ) ? m : 0 );
       second = hour*60*60 + minute*60 + sec;
   } // end method setMinute                    

   // validate and set second                   
   public void setSecond( int s )               
   {                                            
      second = ( ( s >= 0 && s < 86399 ) ? s : 0 );
   } // end method setSecond                    

   // Get Methods         
   // get hour value      
   public int getHour()   
   {                      
      return (second/(60*60));        
   } // end method getHour

   // get minute value      
   public int getMinute()   
   {                        
      return ((second%(60*60))/60);        
   } // end method getMinute

   // get second value      
   public int getSecond()   
   {                        
      return ((second%(60*60))%60);        
   } // end method getSecond

   // convert to String in universal-time format (HH:MM:SS)
   public String toUniversalString()
   {
      return String.format( 
         "%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
   } // end method toUniversalString

   // convert to String in standard-time format (H:MM:SS AM or PM)
   public String toString()
   {
      return String.format( "%d:%02d:%02d %s", 
	         ( (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ),
	         getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
   } // end method toString
} // end class Time2
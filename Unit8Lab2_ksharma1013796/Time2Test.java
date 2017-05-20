// Fig. 8.6: Time2Test.java
// Overloaded constructors used to initialize Time2 objects.

public class Time2Test 
{
   public static void main( String args[] )
   {
      Time2 t1 = new Time2();             // 00:00:00

      t1.setSecond(7210);
      t1.setMinute(2);
      t1.setHour(20);
      System.out.println( "t1: all arguments defaulted" );
      System.out.printf( "   %s\n", t1.toUniversalString() );
      System.out.printf( "   %s\n", t1.toString() );


   } // end main
} // end class Time2Test
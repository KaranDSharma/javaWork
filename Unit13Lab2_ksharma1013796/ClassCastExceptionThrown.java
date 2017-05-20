package APClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClassCastExceptionThrown 
{

    public ClassCastExceptionThrown() 
    {
        List list = new ArrayList();
        list.add("one");
        Iterator it = list.iterator();
        while (it.hasNext()) 
        {

        	try
        	{
        		Integer i = (Integer)it.next();
        	}
        	catch(ClassCastException e)
        	{
        		System.out.println("Class Cast Exception Thrown!");	
        	}
        
       	}

    }

	  public static void main(String[] args) 
	  {
	      new ClassCastExceptionThrown();
	  }

}
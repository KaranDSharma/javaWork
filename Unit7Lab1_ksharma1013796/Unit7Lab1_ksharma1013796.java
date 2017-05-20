import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Unit7Lab1_ksharma1013796 
{
    public static void main(String [] args) 
    {
        String path = "/Users/jyotisharma/Desktop/mcp751/eclipse/APclass/src/";
        String line = null;
        int numParas=0;
        int numWords=0;
        int numSen=0;
        int numChars=0;
        int index = (args.length - 1);
      

        try 
        {
            FileReader fileReader = 
                new FileReader(path.concat(args[index]));
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null)
            {
                //System.out.println(line);
                numParas++;
                numWords += countWords(line);
                numSen += countSentence(line);
                // Adjust for new line character
                numChars += (line.length() + 1);
            }  
            
            for (int i = 0; i < (args.length - 1); i++)
            {
            	if (args[i].equals("-c"))
            	{
            		System.out.println("Total Chars: " + numChars); 
            	} else if (args[i].equals("-w"))
            	{
            	    System.out.println("Total Words: " + numWords);
            	} else if (args[i].equals("-p"))
            	{
                    System.out.println("Total Paras: " + numParas);
            		
            	} else if (args[i].equals("-s"))
            	{
                    System.out.println("Total Sentence(s): " + numSen);
            	}
            }
 //           System.out.println("Total Paras: " + numParas);
   //         System.out.println("Total Sentence(s): " + numSen);           
     //       System.out.println("Total Words: " + numWords);
       //     System.out.println("Total Chars: " + numChars);
            bufferedReader.close(); 
        }
        catch(FileNotFoundException ex) 
        {
            System.out.println(
                "Unable to open file '" + 
                path.concat(args[index]) + "'");                
        }
        catch(IOException ex) 
        {
            System.out.println(
                "Error reading file '" 
                + path.concat(args[index]) + "'");                   
        
        }
    }
    
    public static int countSentence(String s)
    {
        int senCount = 0;

        for (int i = 0; i < s.length(); i++) {
            // if the char is a letter, word = true.
            if (s.charAt(i) == '.')
            {
                senCount++;
            }
        }
        return senCount;
    }
    public static int countWords(String s)
    {
        int wordCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == ' ') || (s.charAt(i) == '\t'))
            {
                wordCount++;
            }
        }
        return wordCount;
    }
}
package APClass;

public class Unit16Lab1_ksharma1013796 
{
	public static boolean testPalindrome(String str, int start, int end)
	{
		if ((start < str.length()) && 
				((str.charAt(start) == ' ') ||
				(str.charAt(start) == ',') ||
				(str.charAt(start) == '.') ||
				(str.charAt(start) == '!') ||
				(str.charAt(start) == '?') ||
				(str.charAt(start) == ';') ||
				(str.charAt(start) == ':')))
		{
			testPalindrome(str, ++start, end);
		}
		if ((start < str.length()) &&
				((str.charAt(end) == ' ') ||
				(str.charAt(end) == ',') ||
				(str.charAt(end) == '.') ||
				(str.charAt(end) == '!') ||
				(str.charAt(end) == '?') ||
				(str.charAt(end) == ';') ||
				(str.charAt(end) == ':')))
		{
			testPalindrome(str, start, --end);
		}
		
		if ((start < str.length()) && (str.charAt(start) == str.charAt(end))) 
		{	
			testPalindrome(str, ++start, --end);
			return true;
		} 		
		return false;
	}
	
	public static void main(String [] args)
	{
		String input= "a  .,;: man a plan a canal panama.";
		System.out.println(testPalindrome(input, 0, (input.length()-1)));
	}
}


public class Unit7Lab2_ksharma1013796 {
	public static void main(String [] args)
	{
		System.out.println(" Binary to Decimanl:" + binary2decimal("00001111"));
		System.out.println(" Decimal to Binary:" + decimal2binary(15));
		System.out.println(" Decimal to Hex:" + decimal2hex(255));
		System.out.println(" Binary to Hex:" + binary2hex("11111111"));
	}
	
	public static int binary2decimal(String str)
	{
		int dec = 0;
		for (int i = 0 ; i < str.length(); i++) 
		{
			System.out.print(str.charAt(i));
			if (str.charAt(i) == '1')
				dec += Math.pow(2, (str.length() - 1 - i));
		}
		System.out.print(":");
		return dec;
	}
	
	public static StringBuilder binary2hex(String str)
	{
		return decimal2hex(binary2decimal(str));
	}
	
	public static StringBuilder decimal2binary(int val)
	{
		StringBuilder str = new StringBuilder(32);
		System.out.print(val+":");
		while (val > 0)
		{
			if (val%2 == 1)
				str.append("1");
			else
				str.append("0");
			val = val >> 1;
		}
		return str.reverse();
	}
	
	public static StringBuilder decimal2hex(int val)
	{
		StringBuilder str = new StringBuilder(32);
		System.out.print(val+":");
		while (val > 0)
		{
			switch (val%16)
			{
			case 0:
				str.append("0");
				break;
			case 1:
				str.append("1");
				break;
			case 2:
				str.append("2");
				break;
			case 3:
				str.append("3");
				break;
			case 4:
				str.append("4");
				break;
			case 5:
				str.append("5");
				break;
			case 6:
				str.append("6");
				break;
			case 7:
				str.append("7");
				break;
			case 8:
				str.append("8");
				break;
			case 9:
				str.append("9");
				break;
			case 10:
				str.append("A");
				break;
			case 11:
				str.append("B");
				break;
			case 12:
				str.append("C");
				break;
			case 13:
				str.append("D");
				break;
			case 14:
				str.append("E");
				break;
			case 15:
				str.append("F");
				break;
			}
			val = val/16;
		}
		return str.reverse();
	}
}

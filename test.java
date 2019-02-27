
public class test 
{

	public static String decimalToBinary(int x) 
	{
		if(x == 0)
		{
			return "";
		}
		if(x % 2 == 1)
		{
			
			return decimalToBinary(x/2) + "1";
		}
		if(x % 2 == 0)
		{	
			return decimalToBinary(x/2) + "0";
		}

		return "";
	}

	public static void main(String[] args)
	{

		System.out.println(decimalToBinary(13));

	}
}

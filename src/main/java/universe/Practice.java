package universe;

public class Practice {
	
	public static void main (String args[])
	{
		System.out.println("Hello world  " +stringReverse("Hello world"));
	}
	
	//Write a Java Program to reverse a string without using String inbuilt function.
	public static String stringReverse(String value)
	{
		String reverse="";
		for(int i=1 ;i<=value.length();i++) reverse +=value.charAt(value.length()-i);
		return reverse;
	}

}

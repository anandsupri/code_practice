package universe;

import java.util.regex.Pattern;

public class Practice {
	
	public static void main (String args[])
	{
		//System.out.println("Hello world  " +stringReverse("Hello world"));
		
		//System.out.println(CodelandUsernameValidation("u__hello_wosfrld123"));
		//System.out.println(CodelandUsernameValidation("helloEorld123"));
		//System.out.println(CodelandUsernameValidation("hel"));
		/*
		 * System.out.println(CodelandUsernameValidation("aa_"));
		 * System.out.println(CodelandUsernameValidation("u__hello_world123"));
		 */
		CodelandNameValidation("Ananda Subrmanian M");//name validation
		CodelandNameValidation("Ananda Subrmanian Mariappan");//name validation
		//CodelandNameValidation("Annie ");
		
		
	}
	
	private static void CodelandNameValidation(String string) {
		String minLenRegex = "^[A-Za-z]{4,}$"; // minimum length validation 
		String maxLenRegex = "^[A-Za-z]{0,10}$"; // minimum length validation 
		String nameRegex = "^[a-zA-Z]{1,8} [a-zA-Z]{1,15} [A-Za-z]{1,}$";
		/*
		 * System.out.println(Pattern.matches(minLenRegex,string));
		 * System.out.println(Pattern.matches(maxLenRegex,string));
		 */
		System.out.println(Pattern.matches(nameRegex,string));
	}

	//Write a Java Program to reverse a string without using String inbuilt function.
	public static String stringReverse(String value)
	{
		String reverse="";
		for(int i=1 ;i<=value.length();i++) reverse +=value.charAt(value.length()-i);
		return reverse;
	}
	
	//Regex practice
	 public static String CodelandUsernameValidation(String str) {
		    
		    //String regex ="^[a-zA-Z][a-zA-Z0-9_]{2,23}[a-zA-Z0-9]$"; // [start with letter][remaining values]{length validation}[[end letter validation]] 
		    //result = Pattern.matches("[a-z0-9A-Z_][]{4,26}+", str);  // [a-z]+ matches one or more lowercase letters, and "helloworld" would return true.
		 String result = Pattern.matches("^[a-zA-Z][a-zA-Z0-9_]{2,23}[a-zA-Z0-9]$", str) ? "true" : "false";
		  return result;
	 }

}

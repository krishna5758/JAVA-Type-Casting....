package Narrowing_Casting;

// Q> Write a program to convert a char to an int, then back to a char. Demonstrate the 
//    effect of narrowing casting.
public class Demo7 {

	public static void main(String[] args) {
		
		char originalChar =  'A'; // ASCII value is 65
		int CharToInt = (int) originalChar;
		char IntToChar = (char) CharToInt;
		
		System.out.println("Original Char : "+originalChar);
		System.out.println("Char to int : "+CharToInt);
		System.out.println("Int to Char : " +IntToChar);
	}
}

package Narrowing_Casting;

// Q> Write a Java program to demonstrate narrowing casting by converting a double 
//    value to an int. Print both the original and the converted values. 

public class Demo3 {

	public static void main(String[] args) {
		
		double OriginalValue = 54.0;
		int ConvertedValue = (int) OriginalValue;
		
		System.out.println("original value (double) : "+OriginalValue);
		System.out.println("Converted Value (int) : "+ConvertedValue);
	}
}

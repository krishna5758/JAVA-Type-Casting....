package Narrowing_Casting;

import java.util.Scanner;

// Q> Create a program to convert a long to a byte and handle the overflow situation
//      gracefully by printing a warning message if the value exceeds the range of byte. 

public class Demo4 {

	public static void main(String[] args) {
		
		long originalValue;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the long value : ");
		 originalValue = sc.nextInt();
		if(originalValue > Byte.MAX_VALUE || originalValue < Byte.MIN_VALUE) {
			System.out.println("Warning: Value exceeds the range of byte!");
			
			
		}else {
			
			byte convertedValue = (byte) originalValue;
			System.out.println("Converted Value (byte) : "+convertedValue);
		}
	}
}

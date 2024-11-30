package Narrowing_Casting;

import java.util.Scanner;

// Q> Implement a program to take a double input from the user and cast it to a byte, 
//    then display the output.

public class Demo6 {

	public static void main(String[] args) {
		
		double originalValue;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter double value : ");
		 originalValue = sc.nextDouble();
		 
		 
		 byte convertedValue = (byte) originalValue;
		 
		 System.out.println("converted value is : "+convertedValue);
	}
}

package Narrowing_Casting;

// Q> Write a program to convert a float to a short. Print the results before 
//    and after casting.

public class Demo5 {

	public static void main(String[] args) {
		 
		float beforeResult = 33.4f;
		short afterResult = (short) beforeResult;
		
		System.out.println("Before result (float) : "+beforeResult);
		System.out.println("After Result (short) : "+afterResult);
	}
}

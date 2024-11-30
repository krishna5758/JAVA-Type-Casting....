package Narrowing_Casting;

import java.util.Scanner;

// Q1.  create a program to calculate the percentage of a user's score in relation
//      to the maximum score in a game.

public class Demo2 {

	public static void main(String[] args) {
		
		int maxScore = 500;
		int userScore;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter user's score : ");
		  userScore = sc.nextInt();
		  
		  float percentage = (float) userScore / maxScore * 100.0f;
		  
		  System.out.println("User's percentage is : "+percentage);
	}
	
	
}
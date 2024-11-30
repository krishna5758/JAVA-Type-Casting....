package Widening_Casting;

/* TYPE CASTING > when you assign a value of one primitive data type to another type 
 *                is called as " Type Casting ".
 *                
 * WIDENING CASTING > 1. converting a smaller data type to larger data type is called
 *                     as "Widening Casting".
 *                     
 *                    2. this casting is done automatically. */

public class Demo1 {

	public static void main(String[] args) {
		
		int a = 54;
		double b = a; // Automatic Casting "int" to "double".
		
		System.out.println(a);
		System.out.println(b);
	}
}

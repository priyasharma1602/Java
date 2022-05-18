package corejava;
import java.util.Scanner;

public class RelOperator {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter value of num1 : ");
		int num1 = s.nextInt();
		
		System.out.println("Enter value of num2 : ");
		int num2 = s.nextInt();
		
	System.out.println("num1 == num2 = " + (num1 == num2) );
		
	System.out.println("num1 != num2 = " + (num1 != num2) );
		
	System.out.println("num1 >  num2 = " + (num1 >  num2) );
		
	System.out.println("num1 <  num2 = " + (num1 <  num2) );
		
	System.out.println("num1 >= num2 = " + (num1 >= num2) );
		
	System.out.println("num1 <= num2 = " + (num1 <= num2) );		
	}
}
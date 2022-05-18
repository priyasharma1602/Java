package corejava;
import java.util.Scanner;

public class logicalANDORNOT {

	public static void main(String[] args) {
			
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a = s.nextInt();
		
		System.out.println("Enter value of b : ");
		int b = s.nextInt();
		
		System.out.println("Enter value of c : ");
		int c = s.nextInt();
		
		System.out.println("Enter value of d : ");
		int d = s.nextInt();
		
		System.out.println(" ---------------- ");
		System.out.println("AND Operator");
		if((a<b) && (b==c)) {
			d=a+b+c;
			System.out.println("Sum is: " + d);
		}
		else {
			System.out.println("False Condition");
		
		}
		System.out.println(" ---------------- ");
		
		System.out.println("OR Operator");
		if( a>b || c==d ) {
			System.out.println("One or both" + " the conditions are true");}
		else
			{
			System.out.println("Both the" + " conditions are false");
			
			}
			
		System.out.println(" ---------------- ");
		System.out.println("NOT Operator");
		 	System.out.println("!(a < b) = " + !(a < b));
	        System.out.println("!(a > b) = " + !(a > b));
	        }
}
package corejava;

import java.util.Scanner;

public class ifelse {
	public static void main(String[] args)
	{
		// create object of scanner class
		Scanner sc= new Scanner(System.in);
		
		//Taking Input from the User
		System.out.println("Enter your Age:");
		int age = sc.nextInt();
		
		//Perform if-else to check condition for voting
	    if (age>=18)
	    	System.out.println("You are Eligible for Voting");
	    else
	    	System.out.println("You are not Eligible");
	}

}

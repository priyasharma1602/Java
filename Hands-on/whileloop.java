package corejava;

import java.util.Scanner;

public class whileloop {
	public static void main(String[] args)
	{
		
		//Create Object for Scanner class
		Scanner sc = new Scanner(System.in);
		
		//Taking input from the User
		System.out.println("Enter the number");
		
		// Declaring and Initializing the number
		int n= sc.nextInt();
		int i=1;
		System.out.println("Multiplication table of" +n+"is:");
		while(i<=10)
		{
			System.out.println(n+"*"+i+"="+(n*i));
			i++;
		}
		
	}

}

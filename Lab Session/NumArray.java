package corejava;
//Java program to find second highest value in a numeric array

import java.util.Scanner;
import java.util.Arrays;
//Main class 
public class NumArray {

	public static void main(String[] args) 
	{
	   //initializing the variable
       int num1;
       
       //Creating Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//Taking input from the user
		System.out.println(" Enter the array length:");
		num1 = sc.nextInt();
		
		 //Initialize array   
		int arr[]= new int[num1];
		System.out.println("Enter "+num1+"these numbers to store in an array");
		for(int i=0; i<num1; i++)
		
		   {
		     arr[i]=sc.nextInt();
		   }
		// Applying sort() method over to above array
	    // by passing the array as an argument
		Arrays.sort(arr);
		int num=arr.length;
		
		// Printing the array after sorting
		System.out.println("Sorted Array"+ Arrays.toString(arr));
		 
		 //Displaying second highest number
		 System.out.println("The secong highest number is :"+arr[num-2]);     
		   }

}
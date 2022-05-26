package corejava;
import java.util.Scanner;
import java.util.Arrays;
public class NumArray {

	public static void main(String[] args) 
	{
       int num1;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the array length:");
		num1 = sc.nextInt();	
		int arr[]= new int[num1];
		System.out.println("Enter "+num1+"these numbers to store in an array");
		for(int i=0; i<num1; i++)
		
		   {
		     arr[i]=sc.nextInt();
		   }
		Arrays.sort(arr);
		int num=arr.length;
		   System.out.println("Sorted Array"+ Arrays.toString(arr));
		   
		   System.out.println("The secong highest number is :"+arr[num-2]);     //Displaying second highest number
		 
		   }

}

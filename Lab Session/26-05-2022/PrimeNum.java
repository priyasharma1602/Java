package corejava;
//Java program to print whether the number is prime number 

import java.util.Scanner;

public class PrimeNum {
public static void main(String args[])
{
//initializing the variables
int num=0;
int prime=0;

//Creating Scanner class object
Scanner sc=new Scanner(System.in);

//Taking input from the User
System.out.print("Enter the number : ");

//capture the input in an integer
num=sc.nextInt();

//Perform if-else to check condition for prime number
if(num%2==0 && num>=2)
{
prime=0;

}
else
{
prime=1;
}
if(prime==0)
{
System.out.println(" is a prime number");
}
else
{
System.out.println("is not a prime number");
}
}

}

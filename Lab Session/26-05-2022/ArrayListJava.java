package corejava;
//Java program to insert an element to  the Array List at the first position
 
import java.util.Scanner;
import java.util.*;  

public class ArrayListJava
{

	public static void main(String[] args) 
	{
		//initializing the variables
		String a, b, c,d;
		int num;
		
		//Creating Scanner class  object
		Scanner sc = new Scanner(System.in);
		
		//Taking input from the user
		System.out.println(" Enter the objects in array list:");
	    a=sc.next();
	    System.out.println(" Enter the objects in array list:");
	    b=sc.next();
	    System.out.println(" Enter the objects in array list:");
	    c=sc.next();
	    System.out.println(" Enter the objects in array list:");
	    d=sc.next();
	    
	    //Creating a list
	    ArrayList<String> list = new ArrayList<String>();
		
	    //Adding elements  in the list
		list.add(" "+a);
		list.add(" "+b);
		list.add(" "+c);
		
		//Adding and printing the elements in the list
		System.out.println("ArrayList : " + list);
		list.add(0, ""+d);
		System.out.println(list);
		}
	}

	

	
                                                                                                                                                                                                                                   
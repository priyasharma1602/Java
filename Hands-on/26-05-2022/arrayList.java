package corejava;
import java.util.Scanner;
import java.util.*;  


public class arrayList {

	public static void main(String[] args) 
	{
		
		String a, b, c;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the objects in array list:");
	    a=sc.next();
	    System.out.println(" Enter the objects in array list:");
	    b=sc.next();
	    System.out.println(" Enter the objects in array list:");
	    c=sc.next();
		ArrayList<String> list = new ArrayList<String>();
		
		list.add(" "+a);
		list.add(" "+b);
		list.add(" "+c);
		System.out.println("ArrayList : " + list);
		list.add(1, "Priya");
		System.out.println(list);
		}
	}

	

	
                                                                                                                                                                                                                                   
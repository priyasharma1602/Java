package corejava;

import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;



public class ArrayIntUser {

 public static void main(String[] args) {
	 
  
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter three values to save in array : ");
  
  
  Integer arr [] = new Integer[3];
  
  
   for(int i=0; i<3; i++) 
     {
       arr[i]=sc.nextInt();
     }
     
     System.out.println("Array is : \t"+ Arrays.toString(arr) );
     
     Arrays.sort(arr);
     
     System.out.println("Sorted Array in Ascending order : \t"+ Arrays.toString(arr));
     
     Arrays.sort(arr, Collections.reverseOrder());
     
     System.out.println("Sorted Array in Descending order : "+ Arrays.toString(arr));

 }

}

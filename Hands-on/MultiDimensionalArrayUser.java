package corejava;

import java.util.Scanner;

public class MultiDimensionalArrayUser{
    
    public static void main(String args[]){
       int row;
       int column;
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter array length : ");
        row=sc.nextInt();
        column=sc.nextInt();
       
        int multi[][]=new int[row][column];
        System.out.println("Enter" + row + "Element to store in Array\n");   
          
        for(int i=0; i<row;i++)
         {            
            for(int j=0; j<column;j++)
             multi[i][j]=sc.nextInt();
         }
        System.out.print("\nEntered Data: \n");
        for(int i=0; i<row; i++) 
   	 {
          for(int j=0; j<column;j++)
   		 System.out.print(multi[i][j]+" ");
   	 }
    
    
    }
	}



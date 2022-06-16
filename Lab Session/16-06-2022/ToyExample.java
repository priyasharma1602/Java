package corejava;

//Impoting required classes and packages
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ToyExample
{
    //Creating multi-dimensional String array
    String[][] toys = new String [6][6];

    //constructor
    ToyExample()
    {

    toys [0][0]="1";
    toys[0][1]="Barbie Doll";

    toys [1][0]="2";
    toys [1][1] ="Hot Wheels";

    toys [2][0]="3";
    toys [2][1]="Doremon";

    toys [3][0]="4";
    toys [3][1]="Shinchan";

    toys [4][0]="5";
    toys[4][1]="Toyshine";

    }
    //Creating getToy function for switch case
    public static String getToy(int price)
    {
        String toyshop;
        switch(price)
        {
        //prices for toys in case value
            case 250: 
            	toyshop = "Barbie Doll";
                return toyshop;
            
            case 200:
            	toyshop= "Hot Wheels";
                return toyshop;
                
            case 150:
            	toyshop = "Doremon";
                return toyshop;
                
            case 230:
            	toyshop = "Shinchan";
                return toyshop;
                
            case 180:
            	toyshop = "Toyshine";
                return toyshop;
                
            default:
            	toyshop = "No Toys Available in this Range";
                return toyshop;
        }
    }
     //main method
    public static void main(String[] args) 
    { 
    	System.out.println("Enter the price for toy: ");
   	
     	//Creating a Scanner class
        Scanner sc = new Scanner (System.in); 
        //Taking input(price) from the user
        int price = sc.nextInt ();
        //Calling getToy function and Printing the value
        System.out.println(getToy(price));
        //Closing Scanner class
        sc.close();
    }
}
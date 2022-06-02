package corejava;
//Java program to Demonstrate on FileOutputStream.
//importing required packages.
import java.io.FileOutputStream;  
public class FileOptStrmEx
{  
    public static void main(String args[])
    {    
    	//Try block to check if exception occurs
           try
           {  
          //Creating an output stream object to create a file
             FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
           //Writing into the file
             String s="Java is an Object-oriented Programming Language"; 
           //converting string into byte array
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("Data entered Sucessfully");    
            }
           //Catch block to handle if error is occurs
           catch(Exception e)
           {
        	 //Printing the Exception
        	   System.out.println(e);
           }    
      }    
}
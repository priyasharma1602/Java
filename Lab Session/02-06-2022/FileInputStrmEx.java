package corejava;
//Java program to Demonstrate on FileInputStream.
//importing required packages.
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class FileInputStrmEx 
{
   public static void main(String args[]) throws IOException
   {
      //Creating a FileInputStream object
      FileInputStream inputStrm = new FileInputStream("D:\\myfile.txt");
      DataInputStream inst = new DataInputStream(inputStrm);  
      int count = inputStrm.available();  
      //Creating a byte array
      byte[] ary = new byte[count];  
     //Reading data into the byte array
      int numByte = inputStrm.read(ary );
      inst.read(ary);  
      for (byte b : ary) {  
          char a = (char) b;
          //Printing the content of the created file
          System.out.print(a);  
        }  
      }  
    }  




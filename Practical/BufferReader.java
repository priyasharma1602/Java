package corejava;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferReader
{
    public static void main(String[]args) throws Exception 
    {
    	// Creates a FileReader
    	// To read from the created file
    	FileReader file = new FileReader("D:/myfile.txt");
    	// Creates a BufferedReader
    	BufferedReader br = new BufferedReader(file);
    	//initializing a variable
    	int i;
    	while((i = file.read())!= -1)
    			{
    		      System.out.print((char)i);
    			}
    	// Closes the reader
    	br.close();
    	file.close();
    }
}

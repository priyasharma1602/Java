package corejava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferWriterEx 
{
	public static void main(String[]args) throws Exception 
	{ 
		// To write in the created file
		FileWriter writer = new FileWriter("D:/myfile.txt");
		// Creates a BufferedWriter
    	BufferedWriter buffer = new BufferedWriter(writer);
    	//printing(writing) the text in the created file
    	buffer.write("Welcome to Mumbai");
    	// Closes the writer
    	buffer.close();
    	System.out.println("Sucess");
	}
}

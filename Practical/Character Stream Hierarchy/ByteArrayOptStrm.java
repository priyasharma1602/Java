package corejava;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOptStrm {

	public static void main(String args[])throws Exception{    
	      FileOutputStream fout1=new FileOutputStream("D:\\myfile.txt");    
	      FileOutputStream fout2=new FileOutputStream("D:\\myfileCopy.txt");    
	        
	      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
	      bout.write(66);    
	      bout.writeTo(fout1);    
	      bout.writeTo(fout2);    
	        
	      bout.flush();    
	      bout.close();//has no effect    
	      System.out.println("Success...");    
	     }    
	    }
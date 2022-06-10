package corejava;
import java.io.*;  

public class DataOpStrm
{
	public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("D:\\myfile.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);  
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }  

}

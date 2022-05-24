package corejava;
import java.util.*;  

class TestJavaCollection{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
list.add("Priya");//Adding object in arraylist  
list.add("Vinayak");  
list.add("Suraj");  
list.add("Tejas");  
//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  

}

package corejava;

public class Encapsulate {
	public static void main(String[] args) { 
		
		//creating object of encapsulation 
		encapsulation e=new encapsulation(); 
		//setting value of variable 
		e.setName("Priya");
		e.setRollno(136); e.setAge(20); 
		
		//displaying value of the variable 
		System.out.println("Name:" +e.getName()); 
		System.out.println("Rollno:" +e.getRollno()); 
		System.out.println("Age:" +e.getAge()); 
		}
	}
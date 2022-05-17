package corejava;

class Employee {
	public void input() {
		System.out.println("PRIYA SHARMA");	
	}
}
class Department extends Employee {
	public void display() {
		System.out.println("Information Technology");
	}
}

public class singleLevel {
	
	public static void main(String[] args) {		
		Department d= new Department();
		d.input();
		d.display();
		
		}

}

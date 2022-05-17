
package corejava;

class SingleInherit {
	public void print() {
		System.out.println("PRIYA");	
	}
}
class SimpleOne extends SingleInherit {
	public void show() {
		System.out.println("SHARMA");
	}
}

class RunMethod{
	
	public static void main(String[] args) {		
		SimpleOne s= new SimpleOne();
		s.print();
		s.show();
		s.print();
		}
}

package corejava;

class Employe {
	public void multi_insert() {
		System.out.println("Priya Sharma");
	}
	
}

class Departments extends Employe {
	public void multi_show() {
		System.out.println("Information Technology");
	}
	
}

class State extends Departments {
	public void multi_print() {
		System.out.println("MAHARASHTRA");
	}
	
}

class multiLevel {

	public static void main(String[] args) {
		State S= new State();
		S.multi_insert();
		S.multi_show();
		S.multi_print();
	}

}
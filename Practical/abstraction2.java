package corejava;

public class abstraction2 extends Abstraction{

	public int Multiply(int n1,int n2){
		return n1*n2;
	}
		public int Multiplyone(int n1,int n2,int n3) {
			return n1* n2 * n3;
		}
	
	public static void main(String[] args) {
		
		Abstraction abs =new abstraction2();
		
		System.out.println("Calling Multiply method: "+abs.Multiply(12,0));
		System.out.println("Calling MultiplyOne method: "+abs.Multiplyone(12,12,1));       
		
		
	}

}
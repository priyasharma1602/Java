package corejava;
import java.util.Scanner; 
public class CallByValueSwapEx {

	/**
	 * @param args
	 */
	//initializing a and b
	int a=20;
	int b=35;
	//swap method
	void swap( CallByValueSwapEx k)
	{
		int temp;
		temp=k.a;
		k.a=k.b;
		k.b=temp;
		System.out.println("before swapping values a="+k.a+" b="+k.b);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating an object
		 CallByValueSwapEx  c=new  CallByValueSwapEx ();
		System.out.println("before swapping values a="+c.a+" b="+c.b);
		//calling swap method by pass-by-value
		c.swap(c);
		

	}

}

package corejava;

public class ExplicitImplicit {
  public static void main(String[] args) {
	
	 //Implicit Conversion
	  int i = 150;
	  
	//automatic type conversion
	double d = i;
	
	System.out.println("Int value "+i);
	System.out.println("Long value "+d);
	System.out.println("------------------------------------------");
	
	//Explicit Conversion
	
	double a = 136.500;
	
	int b =(int) a ;
	
	System.out.println("Double value : " + a);
	System.out.println("Converion to Integer : " + b);


	  
  }
}

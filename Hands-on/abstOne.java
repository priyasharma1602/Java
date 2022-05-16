package corejava;

public class abstOne extends abstractionOne
  {
	public int add(int n1,int n2) 
	{
		return n1+n2;
	}
	public int sub(int n1,int n2) 
	{
		return n1-n2;
	}
	public static void main(String[] args)
	{
		abstractionOne a = new abstOne();
		
		System.out.println("Addition: "+a.add(20, 30));
		System.out.println("Subtraction: "+a.sub(20, 30));
	}

}
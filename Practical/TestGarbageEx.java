package corejava;
//Garbage collection program 

public class TestGarbageEx
{
	public void finalize()
	{
	 System.out.println("garbage collected object");
	}
	public static void main(String args[])
	{
	//Creating TestGarbageEx object
	TestGarbageEx s1=new TestGarbageEx();
	TestGarbageEx s2=new TestGarbageEx();
	s1=null;
	s2=null;
	System.gc();
	}
}

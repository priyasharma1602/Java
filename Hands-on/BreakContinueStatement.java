package corejava;

public class BreakContinueStatement
{

	public static void main(String[] args)
		{
			for(int i=0; i<10; i++) 
			{
				if(i==6) 
				{
					continue;
				}
			else if(i==8) 
				{
					break;
				}
				System.out.println(i);
		
				
			}
		}

}

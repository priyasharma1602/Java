package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	public void Addtest()
	{
	    MyJunitClass junit = new MyJunitClass();
	    int result = junit.add(30,60);
	    assertEquals(40, result);
	}

}

package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConCatTest {

	@Test
	public void ConcatTest()
	{
		MyJunitClass junit = new MyJunitClass();
	    String result = junit.ConCat("Priya","Sharma");
	    assertEquals("riyaSharma", result);
	}

}

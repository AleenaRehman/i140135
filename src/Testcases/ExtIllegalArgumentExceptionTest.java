package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.java.lang.ExtIllegalArgumentException;
import de.susebox.java.lang.ExtIndexOutOfBoundsException;

public class ExtIllegalArgumentExceptionTest {

	@Test
	public void test() {
		Throwable ex = null ;
		ExtIllegalArgumentException exceptiontest = new ExtIllegalArgumentException(ex,"Throw away");
		String result = exceptiontest.getMessage();
		assertNotEquals(result,null);
	}

}

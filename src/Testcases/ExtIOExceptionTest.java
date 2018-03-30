package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.java.io.ExtIOException;
import de.susebox.java.lang.ExtIllegalArgumentException;

public class ExtIOExceptionTest {

	@Test
	public void test() {
		Throwable ex = null ;
		ExtIOException exceptiontest = new ExtIOException(ex,"Throw away");
		String result = exceptiontest.getMessage();
		assertNotEquals(result,null);
	}

}

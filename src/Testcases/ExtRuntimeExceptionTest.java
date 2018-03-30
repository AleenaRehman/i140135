package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.java.lang.ExtRuntimeException;
import de.susebox.java.util.ExtNoSuchElementException;

public class ExtRuntimeExceptionTest {

	@Test
	public void test() {
		Throwable ex = null ;
		ExtRuntimeException exceptiontest = new ExtRuntimeException(ex,"Throw away");
		String result = exceptiontest.getMessage();
		assertNotEquals(result,null);
	}

}

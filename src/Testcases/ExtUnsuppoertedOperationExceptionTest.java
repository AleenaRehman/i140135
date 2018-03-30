package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.java.lang.ExtUnsupportedOperationException;
import de.susebox.java.util.ExtNoSuchElementException;

public class ExtUnsuppoertedOperationExceptionTest {

	@Test
	public void test() {
		Throwable ex = null ;
		ExtUnsupportedOperationException exceptiontest = new ExtUnsupportedOperationException(ex,"Throw away");
		String result = exceptiontest.getMessage();
		assertNotEquals(result,null);
	}

}

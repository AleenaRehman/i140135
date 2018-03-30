package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.java.lang.ExtNoSuchMethodException;
import de.susebox.java.util.ExtNoSuchElementException;

public class ExtNoSuchMethodExceptionTest {

	@Test
	public void test() {
		Throwable ex = null ;
		ExtNoSuchMethodException exceptiontest = new ExtNoSuchMethodException(ex,"Throw away");
		String result = exceptiontest.getMessage();
		assertNotEquals(result,null);
	}

}

package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.java.util.ExtNoSuchElementException;

public class ExtNoSuchElementExceptionTest {

	@Test
	public void test() {
		Throwable ex = null ;
		ExtNoSuchElementException exceptiontest = new ExtNoSuchElementException(ex,"Throw away");
		String result = exceptiontest.getMessage();
		assertNotEquals(result,null);
	}

}

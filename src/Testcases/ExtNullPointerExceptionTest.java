package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.java.lang.ExtNullPointerException;
import de.susebox.java.util.ExtNoSuchElementException;

public class ExtNullPointerExceptionTest {

	@Test
	public void test() {

		Throwable ex = null ;
		ExtNullPointerException exceptiontest = new ExtNullPointerException(ex,"Throw away");
		String result = exceptiontest.getMessage();
		assertNotEquals(result,null);
	}

}

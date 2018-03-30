package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.java.lang.ExtIndexOutOfBoundsException;
import de.susebox.java.util.ExtNoSuchElementException;

public class ExtIndexOutOfBoundsExceptionTest {

	@Test
	public void test() {
		Throwable ex = null ;
		ExtIndexOutOfBoundsException exceptiontest = new ExtIndexOutOfBoundsException(ex,"Throw away");
		String result = exceptiontest.getMessage();
		assertNotEquals(result,null);
	}

}

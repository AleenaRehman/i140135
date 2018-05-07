package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.jtopas.TokenizerException;

public class TokenizerExceptionTest {

	@Test
	public void test() {
		TokenizerException t1 = new TokenizerException("testing");
		String result1 = t1.getMessage();
		assertNotEquals(result1,"null");
		
		Throwable ex = null ;
		TokenizerException t2 = new TokenizerException(ex);
		Throwable result = t2.nextThrowable();
		assertEquals(result,null);
		TokenizerException[] t5= {t1,t2};
		TokenizerException t4 = new TokenizerException("test",t5);
		
		TokenizerException t6 = new TokenizerException(ex,"test",t5);
		
		TokenizerException t3 = new TokenizerException(ex,"test");
	}

}

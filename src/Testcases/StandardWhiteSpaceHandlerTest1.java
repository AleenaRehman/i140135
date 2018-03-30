package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.jtopas.spi.StandardWhitespaceHandler;

public class StandardWhiteSpaceHandlerTest1 {

	@Test
	public void test() {
		StandardWhitespaceHandler whitetest = new StandardWhitespaceHandler(null);
		boolean result = whitetest.isWhitespace('S');
		assertEquals(result,false);
	}

}

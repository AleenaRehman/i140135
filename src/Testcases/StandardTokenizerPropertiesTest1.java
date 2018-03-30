package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.jtopas.StandardTokenizerProperties;

public class StandardTokenizerPropertiesTest1 {

	@Test
	public void test() {
		StandardTokenizerProperties TP = new StandardTokenizerProperties(0x0001);
		boolean result = TP.isWhitespace('\t');
		assertEquals(result,true);
	}

}

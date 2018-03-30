package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.jtopas.TokenizerProperty;

public class TokenizerPropertyTest2 {

	@Test
	public void test() {
		String[] image = {"String","New"};
		TokenizerProperty TP = new TokenizerProperty(3,image);
		TokenizerProperty TPequal = new TokenizerProperty(3,image);
		boolean result = TP.equals(TPequal);
		assertEquals(result,true);
	}

}

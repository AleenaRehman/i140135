package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.jtopas.TokenizerProperty;

public class TokenizerPropertyTest1 {

	@Test
	public void test() {
		String[] image = {"String","New"};
		TokenizerProperty TP = new TokenizerProperty(3,image);
		String result = TP.toString();
		assertNotEquals(result,null);
	}

}

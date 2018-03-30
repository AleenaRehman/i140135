package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.jtopas.StringSource;

public class StringSourceTests {

	@Test
	public void test() throws Exception {
		StringSource stringtest = new StringSource("Testing");
		char[] cbuf = {'T','e','s','t'};
		int result1 = stringtest.read(cbuf, 1, 3);
		assertNotEquals(result1,0);
		
		int result2 = stringtest.length();
		assertNotEquals(result2,0);
		
		char result3 = stringtest.charAt(4);
		assertEquals(result3,'i');
		
		CharSequence result4 = stringtest.subSequence(1,4);
		assertEquals(result4,"est");
	}

}

package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.jtopas.CharArraySource;

public class FailTest1 {

	@Test
	public void test() throws Exception {
		char [] data = {'T','e','s','t','i','n','g'};
		CharArraySource chartest = new CharArraySource(data,0,4);
		
		int result1 = chartest.read(data, 2, 4);
		assertEquals(result1,-1);
		
		char result2 = chartest.charAt(3);
		assertEquals(result2,data[3]);
		
		int result3 = chartest.length();
		assertNotEquals(result3,0);
		
		CharSequence result4 = chartest.subSequence(1, 4);
		assertNotEquals(result4,"test");
		
		String result5 = chartest.toString();
		assertNotEquals(result5,null);
	}

}

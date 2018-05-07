package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.jtopas.CharArraySource;

public class CharArraySourceTests {

	@Test
	public void test() throws Exception {
		char [] data = {'T','e','s','t','i','n','g'};
		CharArraySource chartest = new CharArraySource(data,0,4);
		
		int result1 = chartest.read(data, 2, 4);
		assertNotEquals(result1,-1);
		
		int result1N = chartest.read(data, 0, 4);
		assertEquals(result1N,-1);
		
		CharArraySource chartests = new CharArraySource(data);
		char result2 = chartests.charAt(3);
		assertEquals(result2,data[3]);
		
		int result3 = chartest.length();
		assertNotEquals(result3,0);
		
		CharArraySource charteste = new CharArraySource(data,0,-1);
		CharSequence result4 = charteste.subSequence(1, 4);
		assertNotEquals(result4,"test");
		
		
		String result5 = chartest.toString();
		assertNotEquals(result5,null);


	}

}

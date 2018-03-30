package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.jtopas.CharArraySource;

public class CharArraySourceTest1 {

	@Test
	public void test() throws Exception {
		char [] data = {'T','e','s','t','i','n','g'};
		CharArraySource chartest = new CharArraySource(data,0,4);
		
		int result1 = chartest.read(data, 2, 4);
		assertNotEquals(result1,-1);
	}

}

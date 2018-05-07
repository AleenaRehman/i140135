package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.jtopas.Token;

public class TokenTest1 {

	@Test
	public void test() {
		Token toktest = new Token(2,"token",null);
		
		Token toktestequal = new Token(2,"token",null);
		boolean result1 = toktest.equals(toktestequal);
		assertEquals(result1,true);
		
		Token t = new Token(2);
		Token ts = new Token(1,"token");
		boolean result = t.equals(ts);
		assertEquals(result,false);
		
		Token t1 = new Token();
		t1.setEndPosition(1);
		int result2 = t1.getEndPosition();
		assertNotEquals(result2,1);
	}

}

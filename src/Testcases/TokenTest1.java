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
		
		
	}

}

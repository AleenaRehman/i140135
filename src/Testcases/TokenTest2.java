package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.jtopas.Token;

public class TokenTest2 {

	@Test
	public void test() {
		Token toktest = new Token(2,"token",null);
		String result = toktest.toString();
		assertNotEquals(result,null);
		
		String res = null;
		toktest.setImage(res);
		
		String[] result1 = toktest.getImageParts();
		assertNotEquals(result1,null);
	}

}

package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.jtopas.TokenizerException;
import de.susebox.jtopas.TokenizerProperty;
import de.susebox.jtopas.impl.PatternMatcher;
import de.susebox.jtopas.spi.DataProvider;
import de.susebox.jtopas.spi.PatternHandler;

public class PatternMatcherTest1 {

	@Test
	public void test() throws NullPointerException, TokenizerException {
		String[] images = {"hey","ST"};
		TokenizerProperty TP = new TokenizerProperty(3,images);
		DataProvider data = new DataProvider() {

			@Override
			public char getCharAt(int index) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public char[] getData() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public char[] getDataCopy() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int getStartPosition() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getLength() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		PatternMatcher test = new PatternMatcher(TP, 0x0002);

		PatternHandler.Result result= test.matches(data);
		assertEquals(result, null);
	}

}

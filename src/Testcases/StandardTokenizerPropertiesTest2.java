package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.jtopas.StandardTokenizerProperties;
import de.susebox.jtopas.TokenizerException;
import de.susebox.jtopas.TokenizerProperty;
import de.susebox.jtopas.spi.DataProvider;

public class StandardTokenizerPropertiesTest2 {

	@Test
	public void test() throws NullPointerException, TokenizerException {
		StandardTokenizerProperties TP = new StandardTokenizerProperties(0x0001);
		boolean result = TP.isSeparator('\\');
		assertEquals(result,true);
		
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
			}};
		
		StandardTokenizerProperties TP1 = new StandardTokenizerProperties(0x0001);
		int result1 = TP1.countLeadingWhitespaces(data);
		assertEquals(result1,0);
		
		StandardTokenizerProperties TP2 = new StandardTokenizerProperties(0x0001);
		boolean result3 = TP2.newlineIsWhitespace();
		assertEquals(result3,true);
		
		StandardTokenizerProperties TP3 = new StandardTokenizerProperties(0x0001);
		TokenizerProperty result4 = TP3.startsWithSequenceCommentOrString(data);
		assertEquals(result4,null);
		
		TokenizerProperty result5 = TP.isKeyword(data);
		assertEquals(result5,null);
		
		int result6 = TP.getSequenceMaxLength();
		assertEquals(result6,0);

	}

}

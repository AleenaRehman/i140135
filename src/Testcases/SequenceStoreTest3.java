package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.jtopas.TokenizerException;
import de.susebox.jtopas.TokenizerProperty;
import de.susebox.jtopas.impl.SequenceStore;
import de.susebox.jtopas.spi.DataProvider;

public class SequenceStoreTest3 {


	@Test
	public void startsWithSequenceCommentOrStringtest() throws NullPointerException, TokenizerException {
		SequenceStore startWithSequencetest = new SequenceStore(true);
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
		TokenizerProperty TP = startWithSequencetest.startsWithSequenceCommentOrString(data);
		assertEquals(TP, null);
	}
}
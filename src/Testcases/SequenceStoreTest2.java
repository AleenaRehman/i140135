package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.jtopas.TokenizerProperty;
import de.susebox.jtopas.impl.SequenceStore;
import de.susebox.jtopas.spi.DataProvider;

public class SequenceStoreTest2 {

	@Test
	public void removeSpecialSequenceTest() {
		SequenceStore SpecialSequencetest = new SequenceStore(true);
		TokenizerProperty TP = new TokenizerProperty();
		TokenizerProperty result = SpecialSequencetest.removeSpecialSequence("testing");
		assertEquals(result,null);
	}

}

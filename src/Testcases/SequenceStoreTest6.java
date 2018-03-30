package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.jtopas.TokenizerProperty;
import de.susebox.jtopas.impl.SequenceStore;

public class SequenceStoreTest6 {

	@Test
	public void getSpecialtest() {
		SequenceStore SpecialSequencetest = new SequenceStore(true);
		TokenizerProperty TP = new TokenizerProperty();
		TokenizerProperty result = SpecialSequencetest.getSpecialSequence("testing");
		assertEquals(result,null);
	}

}

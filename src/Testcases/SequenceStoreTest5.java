package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.jtopas.impl.SequenceStore;

public class SequenceStoreTest5 {

	@Test
	public void haskeywordtest() {
		SequenceStore haskeywordtest = new SequenceStore(true);
		boolean result = haskeywordtest.hasKeywords();
		assertEquals(result,false);
	}

}

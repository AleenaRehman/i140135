package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.jtopas.impl.SequenceStore;

public class SecquenceStoreTest1 {

	@Test
	public void storecomparetest() {
		SequenceStore comparetest = new SequenceStore(true);
		int result = comparetest.compare('S','S');
		assertEquals(0, result);
		}

	

}

package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.jtopas.impl.NoCaseSequenceStore;

public class NoCaseSequenceStoreTest2 {

	@Test
	public void comparetest() {
		NoCaseSequenceStore test2 = new NoCaseSequenceStore(true);
		int result = test2.compare('A','A');
		assertEquals(0, result);
	}
}

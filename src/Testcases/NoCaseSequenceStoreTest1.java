package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.jtopas.impl.NoCaseSequenceStore;

public class NoCaseSequenceStoreTest1 {

	@Test
	public void getStartChartest() {
		NoCaseSequenceStore test1 = new NoCaseSequenceStore(true);
		char result = test1.getStartChar('a');
		assertEquals('A', result);
		
	}
}

package Testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import de.susebox.jtopas.impl.SequenceStore;

public class SequenceStoreTest8 {

	@Test
	public void compare2test() {
		SequenceStore comparetest = new SequenceStore(true);
		int result = comparetest.compare("test","test",1);
		assertNotEquals(result,1);
	}

}

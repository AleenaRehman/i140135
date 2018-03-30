package Testcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ExtExceptionsTestSuite.class, JtopassTestSuit.class, NoCaseSequenceStoreTestSuite.class,
		PatternMatchetTestSuite.class, SequenceStoreTestSuite.class, StandardKeywordHandlerTestSuite.class,
		StandardSepratorHandlerTestSuite.class, StandardSequenceHandlerTestSuite.class,
		StandardWhiteSpaceHandlerTestSuite.class })
public class AllTests {

}

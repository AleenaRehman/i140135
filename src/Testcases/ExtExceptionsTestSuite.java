package Testcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ExtIllegalArgumentExceptionTest.class, ExtIndexOutOfBoundsExceptionTest.class, ExtIOExceptionTest.class,
		ExtNoSuchElementExceptionTest.class, ExtNoSuchMethodExceptionTest.class, ExtNullPointerExceptionTest.class,
		ExtRuntimeExceptionTest.class, ExtUnsuppoertedOperationExceptionTest.class })
public class ExtExceptionsTestSuite {

}

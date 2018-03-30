package Testcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CharArraySourceTests.class, StandardTokenizerPropertiesTest1.class,
		StandardTokenizerPropertiesTest2.class, StandardTokenizerTest1.class, StringSourceTests.class,
		TokenizerPropertyTest1.class, TokenizerPropertyTest2.class, TokenTest1.class, TokenTest2.class })
public class JtopassTestSuit {

}

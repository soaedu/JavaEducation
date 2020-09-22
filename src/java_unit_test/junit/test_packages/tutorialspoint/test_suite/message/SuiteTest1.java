package java_unit_test.junit.test_packages.tutorialspoint.test_suite.message;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//JUnit Suite Test
@RunWith(Suite.class)
@Suite.SuiteClasses({MessageTest1.class, MessageTest2.class})
public class SuiteTest1 {
}

package java_unit_test.junit.test_packages.tutorialspoint.junit_3_4.message.test_suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//JUnit Suite Test
@RunWith(Suite.class)
@Suite.SuiteClasses({MessageTest1.class, MessageTest2.class})
public class SuiteTest1 {
}

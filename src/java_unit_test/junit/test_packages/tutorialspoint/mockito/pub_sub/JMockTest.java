package java_unit_test.junit.test_packages.tutorialspoint.mockito.pub_sub;

import java_unit_test.junit.source_packages.tutorialspoint.mockito.pub_sub.Pub;
import java_unit_test.junit.source_packages.tutorialspoint.mockito.pub_sub.Sub;
import junit.framework.TestCase;
import org.jmock.Expectations;
import org.jmock.Mockery;

public class JMockTest extends TestCase {
    Mockery context = new Mockery();
    public void testSubReceivesMessage() {
        // set up
        final Sub sub = context.mock(Sub.class);

        Pub pub = new Pub();
        pub.add(sub);

        final String message = "message";

        // expectations
        context.checking(new Expectations() {{
            oneOf(sub).receive(message);
        }});

        // execute
        pub.publish(message);

        // verify
        context.assertIsSatisfied();
    }
}

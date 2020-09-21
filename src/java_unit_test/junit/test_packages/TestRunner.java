package java_unit_test.junit.test_packages;

import java_unit_test.junit.source_packages.database.DBase;
import java_unit_test.junit.source_packages.database.MyDAO;
import java_unit_test.junit.test_packages.math.MyMathTest;
import java_unit_test.junit.test_packages.math.MyMathTestWithException;
import java_unit_test.junit.test_packages.math.MyMathTestWithParams;
import java_unit_test.junit.test_packages.math.MyMathTestWithTimeout;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.sql.SQLException;

// аналог класса Suit
public class TestRunner {
    public static void main(String[] args) throws SQLException {
        Result result = JUnitCore.runClasses(MyMathTest.class, MyMathTestWithException.class,
                MyMathTestWithParams.class, MyMathTestWithTimeout.class);
        for (Failure failure: result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());

        System.out.println("\n\nStart working with db");
        new MyDAO().update(8, "abc", new DBase());
    }
}

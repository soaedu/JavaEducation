package java_unit_test.junit.test_packages.database;

import java_unit_test.junit.source_packages.database.DBase;
import java_unit_test.junit.source_packages.database.MyDAO;
import java.sql.SQLException;

// аналог класса Suit
public class TestRunner {
    public static void main(String[] args) throws SQLException {
        System.out.println("\n\nStart working with db");
        new MyDAO().update(8, "abc", new DBase());
    }
}

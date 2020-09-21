package java_unit_test.junit.source_packages.database;

import java.sql.SQLException;

public class DBase implements Dao {
    @Override
    public String getItemNameById(int id) {
        System.out.println("\nDBase: getItemNameById(): " +
                "\nid: " +id);
        if (id < 100) {
            return "test name";
        } else return null;
    }

    @Override
    public int update(int id, String name) throws SQLException {
        System.out.println("\nDBase: getItemNameById(): " +
                "\nid: " +id+
                "\nname: " +name
                );

        if (id < 10) {
            return 1;
        } else {
            throw new SQLException("Sql error");
        }
    }
}

package java_unit_test.junit.source_packages.database;

public interface Dao {
    public String getItemNameById(int id);
    public int update(int id, String name) throws java.sql.SQLException;
}

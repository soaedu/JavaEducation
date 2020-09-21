package java_unit_test.junit.source_packages.database;

public class MyDAO {
//    public int update(int id, String newName, DBase database) throws java.sql.SQLException {
    public int update(int id, String newName, Dao database) throws java.sql.SQLException {
        System.out.println("MyDAO: update():" +
                "\nid: " +id);

        String curName = database.getItemNameById(id);
        if (curName != null) {
            curName = newName;
            int result = database.update(id, curName);
            if (result == 2) {
                System.out.println("Error: result == 2");
            }
        } else {
            throw new IllegalArgumentException("Error: record with id: " +id+ " not found");
        }

        return 1;
    }
}

package java_unit_test.junit.test_packages.database;

import java_unit_test.junit.source_packages.database.Dao;
import java_unit_test.junit.source_packages.database.MyDAO;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyDAOTest {
    Mockery mock = new Mockery();

    public MyDAOTest() {
    }

    @Test
    public void testUpdate() throws Exception {
        System.out.println("MyDAOTest: testUpdate()");

        int id = 5;
        String newName = "ewf";
        Dao database = mock.mock(Dao.class);
        mock.checking(new Expectations() {{
            oneOf(database).getItemNameById(id);
//            oneOf(database).update(id, newName);
//            oneOf(database).update(id, newName); will(returnValue(1));
            oneOf(database).update(id, newName); will(returnValue(2));
        }});

        MyDAO instance = new MyDAO();
        int expResult = 1;
        int result = instance.update(id, newName, database);
        assertEquals(expResult, result);
    }
}

package java_regular.data.type.classes.operation.serialization.example4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StaffSerializeMain {
    public static void main(String[] args) {
        Employee[] staff = new Employee[4];
        staff[0] = new Employee("Haug E.J.", 5000, 2000);

        Manager m = new Manager("Adams R.A.", 6000, 2001);
        m.setBonus(500);
        m.setSecretary(staff[0]);
        staff[1] = m;

        m = new Manager("Taylor A.A.", 3500, 1998);
        m.setBonus(1000);
        m.setSecretary(staff[0]);
        staff[2] = m;

        staff[3] = new Employee("Mitchel A.R.", 4300, 1996);

        /*for(int i=0; i<staff.length; i++) {
            System.out.println(staff[i].toString());
        }*/

        System.out.println("Staff: ");
        for(Employee emp: staff) {
            System.out.println("\temp: " +emp.toString());
        }

        System.out.println("-------------------");

        String filePath = "..\\Staff.dat";
        try(FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream output = new ObjectOutputStream(fos);
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream input = new ObjectInputStream(fis) ) {

            output.writeObject(staff);
            Employee[] deserializedStaff = (Employee[]) input.readObject();
            deserializedStaff[0].raiseSalary(10);

            System.out.println("Deserealized staff: ");
            for (Employee emp: deserializedStaff) {
                System.out.println("\temp: " +emp.toString());
            }
        }
        catch(Exception exc) {
            exc.printStackTrace();
        }
    }
}

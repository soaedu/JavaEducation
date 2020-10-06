package enterprise_patterns.data_access_object;

import enterprise_patterns.data_access_object.data_access_object.Student;
import enterprise_patterns.data_access_object.data_access_object.StudentDao;
import enterprise_patterns.data_access_object.data_access_object.StudentDaoImpl;

public class DataAccessObjectMain {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        //print all students
        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : " + student.getRollNo() +
                    ", Name : " + student.getName() + " ]");
        }

        //update student
        Student student =studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        //get the student
        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : " + student.getRollNo() +
                ", Name : " + student.getName() + " ]");
    }
}

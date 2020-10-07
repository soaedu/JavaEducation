package enterprise_patterns.data_access_object.data_access_object;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    // List is working as database
    List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<Student>();

        Student student1 = new Student("Robert", 0);
        students.add(student1);

        Student student2 = new Student("John", 1);
        students.add(student2);
    }

    // retrieve list of students from the database
    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No: " +student.getRollNo()+ ", updated in the database");
    }

    @Override
    public void deleteStudent(Student student) { }
}

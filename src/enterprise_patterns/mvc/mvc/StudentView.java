package enterprise_patterns.mvc.mvc;

public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("\tName:\t " + studentName);
        System.out.println("\tRoll No: " + studentRollNo);
    }
}

package java_unit_test.junit.test_packages.tutorialspoint.junit_3_4.employee.test_asserts;

import java_unit_test.junit.source_packages.tutorialspoint.junit_3_4.employee.EmpBusinessLogic;
import java_unit_test.junit.source_packages.tutorialspoint.junit_3_4.employee.EmployeeDetails;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeDetailsTest {
    EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
    EmployeeDetails employee = new EmployeeDetails();

    // test to check appraisal
    @Test
    public void testCalculateAppraisal() {
        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);

        double appraisal = empBusinessLogic.calculateAppraisal(employee);
        assertEquals(500, appraisal, 0.0);
    }

    // test to check yearly salary
    @Test
    public void testCalculateYearlySalary() {
        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);

        double salary = empBusinessLogic.calculateYearlySalary(employee);
        assertEquals(96000, salary, 0.0);
    }
}

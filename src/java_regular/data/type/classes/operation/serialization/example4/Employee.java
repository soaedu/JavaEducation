package java_regular.data.type.classes.operation.serialization.example4;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private double salary;
    private int year;

    public Employee(String n, double s, int y) {
        name = n;
        salary = s;
        year = y;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String toString() {
        return getClass().getName() + "[name=" + name
                + ", salary=" + salary
                + ", year=" + year + "]";
    }

    public double getSalary() {
        return salary;
    }
}

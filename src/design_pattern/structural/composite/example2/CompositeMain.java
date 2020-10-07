package design_pattern.structural.composite.example2;

import design_pattern.structural.composite.example2.composite.Employee;

public class CompositeMain {
    private enum Departments {
        CEO, Head_Sales, Head_Marketing, Marketing, Sales
    }

    public static void main(String[] args) {
        Employee CEO = new Employee("John", Departments.CEO.toString(),30000);
        Employee headSales = new Employee("Robert", Departments.Head_Sales.toString(),20000);
        Employee salesExecutive1 = new Employee("Richard", Departments.Sales.toString(),10000);
        Employee salesExecutive2 = new Employee("Rob", Departments.Sales.toString(), 10000);

        Employee headMarketing = new Employee("Michel", Departments.Head_Marketing.toString(),20000);
        Employee clerk1 = new Employee("Laura", Departments.Marketing.toString(),1000);
        Employee clerk2 = new Employee("Bob", Departments.Marketing.toString(),10000);

        CEO.add(headSales);
        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        CEO.add(headMarketing);
        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        // print all employees of the organization
        System.out.println(CEO);

        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);

            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}

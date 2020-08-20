package java_regular.data.type.classes.principle.polymorphism.example1;

public class PolymorphismMain {
    public static void main(String[] args) {
        Salary salary = new Salary("Andrey", "Russia", 3, 18_000);
        Employee employee = new Salary("Ivan", "Belarus", 2, 15_000);

        System.out.println("\nCall mailCheck using Salary reference --");
        salary.mailCheck();

        System.out.println("\nCall mailCheck using Employee reference --");
        employee.mailCheck();
    }
}

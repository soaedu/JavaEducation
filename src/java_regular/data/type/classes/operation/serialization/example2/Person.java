package java_regular.data.type.classes.operation.serialization.example2;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    // transient String name;
    String name;
    int age;

    public Person() {
        System.out.println("Person DEFAULT constructor");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age  = age;
        System.out.println("ExtendedPerson constructor");
    }

    public void showInfo() {
        System.out.printf("Name: %s\nAge: %d\n", this.name, this.age);
    }
}

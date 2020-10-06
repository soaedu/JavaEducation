package design_pattern.creational.prototype.example1.human;

import design_pattern.creational.prototype.example1.Copyable;

public class Human implements Copyable {
    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public Object copy() {
        return new Human(age, name);
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

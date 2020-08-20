package java_regular.data.type.classes.principle.inheritance.example1;

/**
 * "Inheritance" is an important pillar of OOP(Object Oriented Programming).
 *
 * It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class.
 *
 * Important terminology:
 *     * Super Class    - whose features are inherited is known as "super class" | "base class" | "parent class".
 *     * Sub Class      - inherits the other class and is known as "sub class" | "derived class" | "extended class" |
 *                          "child class".
 *                        The "subclass" can add its own fields and methods in addition to the superclass fields and
 *                        methods.
 *     * Reusability    - supports the concept of “reusability”, i.e. when we want to create a new class and there is
 *                          already a class that includes some of the code that we want, we can derive our new class
 *                          from the existing class. By doing this, we are reusing the fields and methods of the
 *                          existing class.
 */
public class InheritanceMain {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
    }
}

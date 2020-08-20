package java_regular.syntax.expression.lambda.example3;

import java.time.LocalDate;

public class Person implements Comparable<String> {
    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
        return 18;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    @Override
    public int compareTo(String s) {
        return name.compareTo(s);
    }

    @Override
    public String toString() {
        return "(" +gender+ "): " +name;
    }
}

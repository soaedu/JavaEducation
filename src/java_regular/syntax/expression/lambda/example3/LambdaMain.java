package java_regular.syntax.expression.lambda.example3;

import java.time.LocalDate;
import java.util.*;

public class LambdaMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Alex";
        person1.gender = Person.Sex.MALE;
        person1.birthday = LocalDate.of(1998, 8, 9);
        person1.emailAddress = "alex1998@gmail.com";

        Person person2 = new Person();
        person2.name = "Maria";
        person2.gender = Person.Sex.FEMALE;
        person2.birthday = LocalDate.of(1997, 2, 12);
        person2.emailAddress = "maria1997@gmail.com";

        Person person3 = new Person();
        person3.name = "Bobby";
        person3.gender = Person.Sex.MALE;
        person3.birthday = LocalDate.of(1999, 5, 10);
        person3.emailAddress = "bobby1999@gmail.com";

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        Person[] personArr = personList.toArray(new Person[personList.size()]);

        LambdaMain main = new LambdaMain();
        main.sortPersonByAge(personArr);
        main.sortList(personList);
    }

    public void sortPersonByAge(Person[] personArr) {
        // #1
        Arrays.sort(personArr, new PersonAgeComparator());

        // #2
        // Use of a "lambda expression" instead of defining and then creating a new instance of a class
        // that implements "Comparator"
        Arrays.sort(personArr,
                (Person a, Person b) -> {
                    return a.getBirthday().compareTo(b.getBirthday());
                }
        );

        // #3
        Arrays.sort(personArr, (a, b) -> Person.compareByAge(a, b));

        // #4
        // Because this "lambda expression" invokes an existing method, you can use a method reference instead
        // of a "lambda expression"
        // The method reference "Person::compareByAge" is semantically the same as the "lambda expression"
        //	(a, b) -> Person.compareByAge(a, b)
        Arrays.sort(personArr, Person::compareByAge);
    }

    // Sort a list of string using Java 8 lambda expression
    private void sortList(List<Person> personList) {
        System.out.println("personList: " +personList);
        System.out.println("Sorting...");
        Collections.sort(personList, (s1, s2) -> s1.compareTo(s2.name));
        System.out.println("personList: " +personList);
    }

    class PersonAgeComparator implements Comparator<Person> {
        @Override
        public int compare(Person person1, Person person2) {
            return person1.getBirthday().compareTo(person2.getBirthday());
        }
    }
}

package design_pattern.structural.filter;

import design_pattern.structural.filter.filter.*;

import java.util.ArrayList;
import java.util.List;

public class FilterMain {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Robert", CONST.Gender.male.toString(),
                CONST.MaritalStatus.single.toString()));

        persons.add(new Person("John", CONST.Gender.male.toString(),
                CONST.MaritalStatus.married.toString()));

        persons.add(new Person("Laura", CONST.Gender.female.toString(),
                CONST.MaritalStatus.married.toString()));

        persons.add(new Person("Diana", CONST.Gender.female.toString(),
                CONST.MaritalStatus.single.toString()));

        persons.add(new Person("Mike", CONST.Gender.male.toString(),
                CONST.MaritalStatus.single.toString()));

        persons.add(new Person("Bobby", CONST.Gender.male.toString(),
                CONST.MaritalStatus.single.toString()));

        Criteria male   = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();

        Criteria singleMale = new AndCriteria(single, male);

        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    private static void printPersons(List<Person> persons) {
        for(Person person: persons) {
            System.out.println("Person: [ Name : "+person.getName()+ ", Gender : " +person.getGender()+
                    ", Marital status : " +person.getMaritalStatus()+ " ]");
        }
    }
}

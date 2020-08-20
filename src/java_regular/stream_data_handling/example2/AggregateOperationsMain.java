package java_regular.stream_data_handling.example2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AggregateOperationsMain {
    public static void main(String[] args) {
        // limit() - reduces the size of the stream
        // forEach() - iterates each element of the "stream"
        // print 10 random numbers using: "limit()", "forEach()":
        Random random = new Random();
        System.out.println("Random numbers: ");
        IntConsumer intConsumer = (x) -> System.out.println("\tnumber: " +x);
        // random.ints().limit(10).forEach(System.out::println);
        random.ints().limit(10).forEach(intConsumer);

        // sorted()
        System.out.println("\nSorted random numbers: ");
        random.ints().limit(10).sorted().forEach(intConsumer);

        // filter()
        // print a count of empty strings
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println("\nStrings: " +strings+ "\n\tempty strings amount: " +count);

        // map()
        // print list of unique squares
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        System.out.println("\nNumbers: " +numbers+ "\n\tUnique squares:" +squaresList);

        // reduce()
        // print the result of calculation the sum of a List<Integer> and some initial Integer
        int initialValue = 23;
        List<Integer> integers = Arrays.asList(1, 1, 1);
        Integer reduced = integers.stream().reduce(initialValue, (a, b) -> a + b);
        System.out.println("\nNumbers: " +integers+ "\n\tSum of all numbers and " +initialValue+ " = " +reduced);

        // findAny()
        // print the first customer that matches the filter or null
        List<Customer> customers = Arrays.asList(new Customer("James", "Norton"),
                new Customer("Karl", "Libkneht"), new Customer("James", "Gosling"));
        Customer james = customers.stream().filter(customer -> "James".equals(customer.getName())).findAny()
                .orElse(null);
        System.out.println("\nfindAny()");
        System.out.println("Customers: " +customers+ "\n\tFound \"James\": " +james);

        // allMatch()
        // print the result =
        //  * true  - if all items match the provided predicate condition
        //  * false - if even one items does not match the provided predicate condition
        Predicate<Customer> jamesPredicate = customer -> customer.firstName.equals("James");

        boolean allCustomersAreJames = customers.stream().allMatch(jamesPredicate);
        System.out.println("\nallMatch()");
        System.out.println("Customers: " +customers+ "\n\tAll customers have the name \"James\": "
                +allCustomersAreJames);

        // anyMatch()
        // print the result =
        //  * true  - if at least 1 of the elements of the stream match the provided predicate condition
        //  * false - if none of the elements match the predicate condition.
        boolean atLeastOneCustomerIsJames = customers.stream().anyMatch(jamesPredicate);
        System.out.println("\nanyMatch()");
        System.out.println("Customers: " +customers+ "\n\tAt least one customer have the name \"James\":"
                +atLeastOneCustomerIsJames);

        // noneMatch()
        // print the result =
        //  * true  - if none of the elements of the stream match the provided predicate condition.
        //  * false - if one (or more) of the elements match the predicate condition.
        boolean noOneCustomerIsJames = customers.stream().noneMatch(jamesPredicate);
        System.out.println("\nnoneMatch()");
        System.out.println("Customers: " +customers+ "\n\tNo one customer have the name \"James\":"
                +noOneCustomerIsJames);
    }

    static class Customer {
        private String firstName;
        private String lastName;

        public Customer(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }
}

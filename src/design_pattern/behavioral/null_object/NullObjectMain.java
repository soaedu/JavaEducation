package design_pattern.behavioral.null_object;

import design_pattern.behavioral.null_object.null_object.AbstractCustomer;
import design_pattern.behavioral.null_object.null_object.CustomerFactory;

public class NullObjectMain {
    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers:");
        System.out.println("\t" + "* " + customer1.getName());
        System.out.println("\t" + "* " + customer2.getName());
        System.out.println("\t" + "* " + customer3.getName());
        System.out.println("\t" + "* " + customer4.getName());
    }
}

package java_regular.data.type.classes.principle.encapsulation;

public class EncapsulationMain {
    public static void main(String[] args) {
        EncapsulationClass obj = new EncapsulationClass();
        obj.setName("Joe");
        obj.setAge(20);
        obj.setIdNum("12387Vm");

        System.out.println("Name:\t" +obj.getName()+ "\nAge: \t" +obj.getAge());
    }
}

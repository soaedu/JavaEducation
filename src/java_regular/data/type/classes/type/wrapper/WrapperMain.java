package java_regular.data.type.classes.type.wrapper;

public class WrapperMain {
    public static void main(String[] args) {
        Class<?> class1 = null;
        Class<?> class2 = null;

        String str = "MyString";
        class1 = str.getClass();

        try {
            class2 = Class.forName("java.lang.String");

            System.out.println("Is it a primitive: " +class1.isPrimitive());
            System.out.println("\nPackage: " +class1.getPackage());
            System.out.println("\nSuperclass: " +class1.getSuperclass());

            class2.getClass();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

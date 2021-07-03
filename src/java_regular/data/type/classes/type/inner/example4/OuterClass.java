package java_regular.data.type.classes.type.inner.example4;

public class OuterClass {
    // Instance method of the outer class
    void myMethod() {
        int num = 23;

        // method-local inner class
        class InnerMethodLocal {
            public void print() {
                System.out.println("This is the method inner class " + num);
            }
        }

        // Accessing the inner class
        InnerMethodLocal innerClass = new InnerMethodLocal();
        innerClass.print();
    }
}

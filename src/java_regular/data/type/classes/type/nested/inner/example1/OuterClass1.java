package java_regular.data.type.classes.type.nested.inner.example1;

public class OuterClass1 {
    int num;

    // inner class
    private class Inner {
        public void print() {
            System.out.println("This is an inner class");
        }
    }

    // Accessing the inner class from the method within
    void displayInner() {
        Inner inner = new Inner();
        inner.print();
    }
}

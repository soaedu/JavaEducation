package java_regular.data.type.classes.type.inner.example1;

/*
    Example from web-site: http://tutorialspoint.com"
 */
public class InnerClassMain {
    public static void main(String[] args) {
        // Instantiating the outer class
        OuterClass1 outerClass1 = new OuterClass1();
        // Accessing the displayInner() method
        outerClass1.displayInner();

        OuterClass2 outerClass2 = new OuterClass2();
        // Instantiating the inner class
        OuterClass2.Inner innerClass = outerClass2.new Inner();
        System.out.println(innerClass.getNum());
    }
}

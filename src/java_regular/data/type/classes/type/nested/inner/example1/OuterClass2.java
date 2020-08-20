package java_regular.data.type.classes.type.nested.inner.example1;

public class OuterClass2 {
    // private variable of the outer class
    private int num = 175;

    // inner class
    public class Inner {
        public int getNum() {
            System.out.println("This is the getNum() method of the inner class");
            return num;
        }
    }
}

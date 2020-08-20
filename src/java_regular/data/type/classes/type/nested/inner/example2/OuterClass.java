package java_regular.data.type.classes.type.nested.inner.example2;

public class OuterClass {
    public String outerField = "Outer class";

    public void show()
    {
        System.out.println(outerField);
    }

    public class MyInner {
        public String innerField = "MyInner class";

        public void showInner() {
            System.out.println(innerField);
        }
    }

    public static class MyStaticNested {
        public String  nestedField = "MyStaticNested class";

        public void showNested() {
            System.out.println(nestedField);
        }
    }
}

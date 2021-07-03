package java_regular.data.type.classes.type.inner.example2;

public class OuterClass {
    public String outerField = "Outer class";

    public void show() {
        System.out.println("\nOuterClass.show(): " +
                            "\n\touterField: " +outerField);
    }

    public class MyInner {
        public String innerField = "MyInner class";

        public void showInner() {
            // Могу обратиться к полю внешнего класса
            outerField = "123";

            System.out.println("\nMyInner.showInner(): " +
                                "\n\tinnerField: " +innerField);
        }

        public void showOuter() {
            System.out.println("MyInner.showOuter():" +
                                "\n\touterField: " +outerField);
        }
    }

    public static class MyNested {
        public String nestedField = "MyNested class";

        public void showNested() {
            System.out.println("\nMyNested.showNested():" +
                    "\n\tnestedField: " +nestedField);
        }

        // Не могу обратиться к полю внешнего класса
        /*public void showOuter() {
            System.out.println("showOuter():" +
                    "\n\touterField: " +outerField);
        }*/
    }
}

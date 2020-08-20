package java_regular.data.type.collections.operation.sort.example2;

import java.util.Comparator;

public class MyClassComparator implements Comparator {
    /*@Override
    public int compare(Object o1, Object o2) {
        int result = o1.toString().compareTo(o2.toString());
        System.out.println("Object o1: " +o1.toString()+
                "\nObject o2: " +o2.toString()+
                "\nCompare result: " +result);
        return result;
    }*/

    private final SortDirection direction;

    public MyClassComparator() {
        this.direction = SortDirection.FORWARD;
    }

    public MyClassComparator(SortDirection direction) {
        this.direction = direction;
    }

    @Override
    public int compare(Object o1, Object o2) {
        int result = o1.toString().compareTo(o2.toString());

        if (direction == SortDirection.BACKWARD && result != 0) {
            result = -result;
        }

        /*System.out.println("Object o1: " +o1.toString()+
                "\nObject o2: " +o2.toString()+
                "\nCompare result: " +result);*/

        return result;
    }

    public enum SortDirection {
        FORWARD, BACKWARD
    }
}

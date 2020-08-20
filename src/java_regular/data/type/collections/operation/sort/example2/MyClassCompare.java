package java_regular.data.type.collections.operation.sort.example2;

public class MyClassCompare implements Comparable<MyClassCompare> {
    private String name;

    public MyClassCompare(String name) {
        this.name = name;
    }

    // сравниваем текущий объект с переданным в качестве аргумента
    public int compareTo(MyClassCompare o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name;
    }
}

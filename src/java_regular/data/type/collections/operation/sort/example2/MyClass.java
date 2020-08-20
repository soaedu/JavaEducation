package java_regular.data.type.collections.operation.sort.example2;

public class MyClass <T> {
    private T name;

    public MyClass(T name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name.toString();
    }
}

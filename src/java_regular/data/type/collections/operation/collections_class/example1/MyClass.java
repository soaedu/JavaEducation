package java_regular.data.type.collections.operation.collections_class.example1;

public class MyClass<T> {
    private T name;

    public MyClass(T name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name.toString();
    }

    // Без методов equals и hashCode не будет замены в списках
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final MyClass other = (MyClass) obj;

        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }
}

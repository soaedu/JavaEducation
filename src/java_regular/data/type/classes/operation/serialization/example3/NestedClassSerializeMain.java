package java_regular.data.type.classes.operation.serialization.example3;

import java.io.*;

public class NestedClassSerializeMain {
    public static void main(String[] args) throws Exception {
        MyClass2 m2 = new MyClass2();

        // записываем класс в файл, а потом восстанавливаем его в памяти
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("..\\NestedClass.ser"));
        o.writeObject(m2);
        o.flush();
        o.close();

        // достаем объект из файла и проверяем значения поля i
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("..\\NestedClass.ser"));
        MyClass2 obj2 = (MyClass2) input.readObject();
        input.close();

        if (obj2 != null && obj2.m1 != null) {
            System.out.println(obj2.m1.getI());
        } else {
            System.out.println("Null object..");
        }
    }
}

class MyClass1 implements Serializable {
    private static final long serialVersionUID = 1L;

    public int i;

    public int getI() {
        return i;
    }
}

class MyClass2 implements Serializable {
    private static final long serialVersionUID = 1L;

    public MyClass1 m1;
}

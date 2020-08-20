package java_regular.data.type.classes.operation.serialization.example1;

import java.io.*;

public class SerializeMain {
    public static void main(String[] args) {
        // объект типа строка
        String str = "My string";

        // объект типа массив
        int[] intArr = {1,2,3};

        String filePath = "..\\Writeme.ser";

        // для сохранения этих объектов запишем их в выходной поток
        // используем два класса для записи и чтения объектов ObjectInputStream и ObjectOutputStream

        try(FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream output = new ObjectOutputStream(fos);    // обволакиваем входной файловый поток
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream input = new ObjectInputStream(fis);       // обволакиваем выходной файловый поток
        ) {

            // записываем объекты в поток
            output.writeObject(str);
            output.writeObject(intArr);
            // очищаем буфер
            output.flush();

            // восстанавливаем объекты в оперативной памяти

            // читаем объекты из потока
            String str1 = (String) input.readObject();
            System.out.println(str1);
        }
        catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}

package java_regular.data.type.classes.operation.serialization.example2;

import java.io.*;

public class SerializePersonMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("Ivan", 44);
        person.showInfo();

        File file = new File("..\\PersonInfo.ser");

        try(FileOutputStream fs = new FileOutputStream(file);
            ObjectOutputStream os = new ObjectOutputStream(fs);
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis)) {

            os.writeObject(person);

            System.out.println("****Object reconstruction****");
            Person restoredPerson = (Person) ois.readObject();
            restoredPerson.showInfo();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

package java_regular.data.type.collections.type.maps.properties;

import Utils.CollectionHelper;
import java.io.*;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class PropertiesMain {
    static Properties properties = new Properties();

    public static void main(String[] args) {
        addNewItems();
        printProperties();
        getProperties();

        System.out.println();
        saveProperties();
    }

    private static void addNewItems() {
        // put()
        System.out.print("\nAdding new items into \"properties\"...");
        properties.put("ide", "ide.geeksforgeeks.org");
        properties.put("contribute", "contribute.geeksforgeeks.org");
        properties.put("quiz", "quiz.geeksforgeeks.org");
    }

    private static void printProperties() {
        CollectionHelper.printCollection(properties.keySet().iterator(), "\nProperties");

        // list(PrintStream streamOut)
        System.out.println("\n");
        properties.list(System.out);

        // list(PrintWriter streamOut)
        System.out.println();
        PrintWriter writer = new PrintWriter(System.out);
        properties.list(writer);

        // propertyNames()
        Enumeration keyEnumeration = properties.propertyNames();
        System.out.print("Properties names:");
        while (keyEnumeration.hasMoreElements()) {
            System.out.print("\n\t" +keyEnumeration.nextElement());
        }

        // stringPropertyNames()
        System.out.print("\n\nProperty name in the set: ");
        Set<String> set = properties.stringPropertyNames();
        System.out.print("\n\t" +set);
    }

    private static void getProperties() {
        // getProperty()
        String wrongUrlKey = "articl";
        System.out.println("\n\nLooking for URL that not in list...");
        System.out.print("The URL for article is " + properties.getProperty(wrongUrlKey, "not found"));
    }


    private static void saveProperties() {
        try (FileOutputStream out = new FileOutputStream("properties.txt");
             FileInputStream in = new FileInputStream("properties.txt");) {

            // save()
            System.out.println("\nSaving the properties in specified txt file...");
            properties.save(out, null);
            properties.load(in);

            System.out.println();
            properties.list(System.out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileOutputStream out = new FileOutputStream("properties.xml");
             FileInputStream in = new FileInputStream("properties.xml");) {

            // storeToXML()
            System.out.println("\nStore the properties into specified xml file...");
            // properties.storeToXML(out, "Demo of properties class", "ISO-8859-3");
            properties.storeToXML(out, null);

            while (in.available() > 0) {
                System.out.print((char) in.read());
            }

            // loadFromXML()
            System.out.println("\nLoad the properties from specified xml file...");
            properties.loadFromXML(in);
            properties.list(System.out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

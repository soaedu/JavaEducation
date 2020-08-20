package java_regular.data.type.collections.type.maps.enum_map;

import Utils.CollectionHelper;
import java.util.EnumMap;

public class EnumMapMain {
    static EnumMap<DataType, String> enumMap = new EnumMap<>(DataType.class);

    public static void main(String[] args) {
        addNewItems();
        printEnumMapInfo();
        checkContains();
    }

    private static void addNewItems() {
        // put()
        System.out.print("\nAdding new items to \"enumMap\"...");
        // Inserting Enum keys different from their natural order
        enumMap.put(DataType.TEXT, "Text");
        enumMap.put(DataType.SLIDES, "Slides");
        enumMap.put(DataType.VIDEO, "Video");
        enumMap.put(DataType.IMAGE, "Image");
        CollectionHelper.printCollection(enumMap, "EnumMap");
    }

    private static void printEnumMapInfo() {
        // size()
        System.out.println("\n\nSize of \"enumMap\": " + enumMap.size());

        // get()
        // Retrieving value from EnumMap in java
        DataType key = DataType.VIDEO;
        System.out.println("\nKey: " + key + " Value: " + enumMap.get(key));
    }

    private static void checkContains() {
        DataType keyToCheck = DataType.SLIDES;
        String value1ToCheck = "Video";
        String value2ToCheck = "Room";

        // containsKey(), containsValue()
        System.out.println("\nEnum map contains: " +
                "\n\tkey \"" +keyToCheck+ "\": " +enumMap.containsKey(keyToCheck)+
                "\n\tvalue \"" +value1ToCheck+ "\": " +enumMap.containsValue(value1ToCheck)+
                "\n\tvalue \"" +value2ToCheck+ "\": " +enumMap.containsValue(value2ToCheck)+
                "\n\tvalue \"null\": " +enumMap.containsValue(null)
                );
    }
}

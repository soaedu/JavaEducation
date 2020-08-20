package java_regular.data.type.collections.type.sets.enum_set;

import Utils.CollectionHelper;

import java.util.EnumSet;

public class EnumSetMain {
    public static void main(String[] args) {
        EnumSet<DataType> enumSet1, enumSet2, enumSet3, enumSet4;

        // of()
        System.out.print("\nCreating \"enumSet1\" (EnumSet.of)...");
        enumSet1 = EnumSet.of(DataType.IMAGE, DataType.SLIDES, DataType.TEXT);
        CollectionHelper.printCollection(enumSet1, "EnumSet1");

        // complementOf()
        System.out.print("\n\nCreating \"enumSet2\" (EnumSet.complementOf)...");
        enumSet2 = EnumSet.complementOf(enumSet1);
        CollectionHelper.printCollection(enumSet2, "EnumSet2");

        // allOf()
        System.out.print("\n\nCreating \"enumSet3\" (EnumSet.allOf)...");
        enumSet3 = EnumSet.allOf(DataType.class);
        CollectionHelper.printCollection(enumSet3, "EnumSet3");

        // range()
        System.out.print("\n\nCreating \"enumSet4\" (EnumSet.range)...");
        enumSet4 = EnumSet.range(DataType.IMAGE, DataType.VIDEO);
        CollectionHelper.printCollection(enumSet4, "EnumSet4");
    }
}

package java_regular.data.type.enums.example1;

public enum FacultyWithHead {
    MMF("Ion Busuioc"), FPMI("Stepan Cera"), GEO("Alla Crudu");

    String name;

    FacultyWithHead(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

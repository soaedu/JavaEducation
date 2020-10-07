package enterprise_patterns.composite_entity;

import enterprise_patterns.composite_entity.composite_entity.Client;

public class CompositeEntityMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}

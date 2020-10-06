package design_pattern.structural.proxy.example1.image;

// Service
public class RealImage implements Image {
    String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    void load() {
        System.out.println("Image loading...");
    }

    @Override
    public void display() {
        System.out.println("Displaying " +file);
    }
}

package design_pattern.structural.facade.parts;

public class DVDRom {
    private boolean data = false;

    public boolean hasData() {
        return data;
    }

    public void load() {
        data = true;
    }

    void unload() {
        data = false;
    }
}

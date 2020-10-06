package design_pattern.behavioral.memento.example1;

// Memento
public class Save {
    private final String level;
    private final int timestamp;

    public Save(String level, int timestamp) {
        this.level = level;
        this.timestamp = timestamp;
    }

    public String getLevel() {
        return level;
    }

    public int getTimestamp() {
        return timestamp;
    }
}

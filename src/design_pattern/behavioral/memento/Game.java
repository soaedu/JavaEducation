package design_pattern.behavioral.memento;

// Originator
public class Game {
    private String level;
    private int timestamp;

    public void set(String level, int ms) {
        this.level = level;
        this.timestamp = ms;
    }

    public void load(Save save) {
        level = save.getLevel();
        timestamp = save.getTimestamp();
    }

    public Save save() {
        return new Save(level, timestamp);
    }

    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}

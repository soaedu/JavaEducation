package design_pattern.behavioral.memento.example1;

// Caretaker
public class File {
    Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}

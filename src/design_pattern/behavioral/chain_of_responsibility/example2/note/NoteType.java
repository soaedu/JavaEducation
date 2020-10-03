package design_pattern.behavioral.chain_of_responsibility.example2.note;

public enum NoteType {
    R100(100), R500(500), R1000(1000), R5000(5000);

    public final int value;

    NoteType(int value) {
        this.value = value;
    }
}

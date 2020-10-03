package design_pattern.behavioral.chain_of_responsibility.example2.note;

import design_pattern.behavioral.chain_of_responsibility.example2.Money;

public abstract class NoteModule {
    private NoteType noteType;

    protected NoteModule next;

    public NoteModule(NoteType noteType) {
        this.noteType = noteType;
    }

    public void takeMoney(Money money) {
        int countNote = money.getAmount() / noteType.value;
        int remind = money.getAmount() % noteType.value;

        if (countNote > 0) {
            System.out.println("Issued " +countNote+ " bills in denomination " +noteType.value);
        }

        boolean canMoveNext = (next != null);

        if (remind > 0 && canMoveNext) {
            next.takeMoney(new Money(remind));
        }
    }

    public void setNextMoneyModule(NoteModule module) {
        next = module;
    }
}

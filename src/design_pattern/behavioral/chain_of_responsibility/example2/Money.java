package design_pattern.behavioral.chain_of_responsibility.example2;

import design_pattern.behavioral.chain_of_responsibility.example2.note.NoteType;

public class Money {
    private final int LIMIT = 200_000;
    private int amount;

    public Money(int amount) {
        setAmount(amount);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        boolean limitNotExceeded = (amount > 0 && amount < LIMIT);
        boolean isMultiple = amount% NoteType.R100.value == 0;

        if (limitNotExceeded && isMultiple) {
            this.amount = amount;
        } else {
            throw new RuntimeException("The sum must be less than " +LIMIT+ " and multiple to " +NoteType.R100.value);
        }
    }
}

package design_pattern.behavioral.chain_of_responsibility.example2;

import design_pattern.behavioral.chain_of_responsibility.example2.note.NoteModule;
import design_pattern.behavioral.chain_of_responsibility.example2.note.type.NoteModule100;
import design_pattern.behavioral.chain_of_responsibility.example2.note.type.NoteModule1000;
import design_pattern.behavioral.chain_of_responsibility.example2.note.type.NoteModule500;
import design_pattern.behavioral.chain_of_responsibility.example2.note.type.NoteModule5000;

public class Bankomat {
    public static void main(String[] args) {
        // All banknotes are
        NoteModule note100 = new NoteModule100();

        NoteModule note500 = new NoteModule500();
        note500.setNextMoneyModule(note100);

        NoteModule note1000 = new NoteModule1000();
        note1000.setNextMoneyModule(note500);

        NoteModule note5000 = new NoteModule5000();
        note5000.setNextMoneyModule(note1000);
        note5000.takeMoney(new Money(52_700));


        // Situation when bankomat has not 100 denomination banknotes
        /*NoteModule note100 = new NoteModule100();

        // NoteModule note500 = new NoteModule500();
        // note500.setNextMoneyModule(note100);

        NoteModule note1000 = new NoteModule1000();
        note1000.setNextMoneyModule(note100);

        NoteModule note5000 = new NoteModule5000();
        note5000.setNextMoneyModule(note1000);
        note5000.takeMoney(new Money(52_700));*/
    }
}

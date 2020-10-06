package design_pattern.behavioral.command.example1.command.type;

import design_pattern.behavioral.command.example1.command.Command;
import design_pattern.behavioral.command.example1.command.Computer;

// Concrete Command
public class StartCommand implements Command {
    Computer computer;

    public StartCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.start();
    }
}

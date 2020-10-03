package design_pattern.behavioral.command.command.type;

import design_pattern.behavioral.command.command.Command;
import design_pattern.behavioral.command.command.Computer;

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

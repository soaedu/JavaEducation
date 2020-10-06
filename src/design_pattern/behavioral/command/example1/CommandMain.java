package design_pattern.behavioral.command.example1;

import design_pattern.behavioral.command.example1.command.Computer;
import design_pattern.behavioral.command.example1.command.User;
import design_pattern.behavioral.command.example1.command.type.ResetCommand;
import design_pattern.behavioral.command.example1.command.type.StartCommand;
import design_pattern.behavioral.command.example1.command.type.StopCommand;

public class CommandMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        User user = new User(
                new StartCommand(computer),
                new StopCommand(computer),
                new ResetCommand(computer)
        );

        user.startComputer();
        user.stopComputer();
        user.resetComputer();
    }
}

package design_pattern.behavioral.command;

import design_pattern.behavioral.command.command.Computer;
import design_pattern.behavioral.command.command.User;
import design_pattern.behavioral.command.command.type.ResetCommand;
import design_pattern.behavioral.command.command.type.StartCommand;
import design_pattern.behavioral.command.command.type.StopCommand;

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

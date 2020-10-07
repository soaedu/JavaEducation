package design_pattern.behavioral.chain_of_responsibility.chain_of_responsibility.example1.type;

import design_pattern.behavioral.chain_of_responsibility.example1.logger.Logger;

public class EmailLogger extends Logger {
    public EmailLogger(int priority) {
        super(priority);
    }

    @Override
    protected void write(String message) {
        System.out.println("EmailLogger: " +message);
    }
}

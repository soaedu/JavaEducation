package design_pattern.behavioral.chain_of_responsibility.example3.logger.type;

import design_pattern.behavioral.chain_of_responsibility.example3.logger.AbstractLogger;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}

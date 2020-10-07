package design_pattern.behavioral.chain_of_responsibility.chain_of_responsibility.example1;

import design_pattern.behavioral.chain_of_responsibility.chain_of_responsibility.example1.type.EmailLogger;
import design_pattern.behavioral.chain_of_responsibility.chain_of_responsibility.example1.type.FileLogger;
import design_pattern.behavioral.chain_of_responsibility.chain_of_responsibility.example1.type.SmsLogger;
import design_pattern.behavioral.chain_of_responsibility.example1.logger.LogLevel;
import design_pattern.behavioral.chain_of_responsibility.example1.logger.Logger;

public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        Logger emailLogger = new EmailLogger(LogLevel.Info.value);

        Logger fileLogger = new FileLogger(LogLevel.Debug.value);
        fileLogger.setNext(emailLogger);

        Logger smsLogger = new SmsLogger(LogLevel.Error.value);
        smsLogger.setNext(fileLogger);

        smsLogger.writeMessage("Info message", LogLevel.Info.value);
        smsLogger.writeMessage("Debug message", LogLevel.Debug.value);
        smsLogger.writeMessage("Error message", LogLevel.Error.value);
    }
}

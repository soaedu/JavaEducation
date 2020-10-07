package design_pattern.behavioral.command.example1.command;

// Receiver
public class Computer {
    public void start() {
        System.out.println("Start");
    }
    public void stop() {
        System.out.println("Stop");
    }
    public void reset() {
        System.out.println("Reset");
    }
}

package design_pattern.behavioral.chain_of_responsibility.example1.logger;

public abstract class Logger {
    int priority;
    Logger next;

    public Logger(int priority) {
        this.priority = priority;
    }

    public void writeMessage(String message, int level) {
        if (level <= priority) {
            write(message);
        }

        if (next != null) {
            next.writeMessage(message, level);
        }
    }

    protected abstract void write(String message);

    public void setNext(Logger next) {
        this.next = next;
    }
}

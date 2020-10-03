package design_pattern.behavioral.chain_of_responsibility.example1.logger;

public enum LogLevel {
    Error(1), Debug(2), Info(3);

    public final int value;

    LogLevel(int value) {
        this.value = value;
    }
}

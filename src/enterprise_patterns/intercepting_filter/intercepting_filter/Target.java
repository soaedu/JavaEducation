package enterprise_patterns.intercepting_filter.intercepting_filter;

public class Target {
    public void execute(String request) {
        System.out.println("Executing request: " +request);
    }
}

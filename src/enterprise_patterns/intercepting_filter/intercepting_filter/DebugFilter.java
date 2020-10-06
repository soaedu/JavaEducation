package enterprise_patterns.intercepting_filter.intercepting_filter;

public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}

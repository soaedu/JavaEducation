package enterprise_patterns.intercepting_filter.intercepting_filter;

public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " +request);
    }
}

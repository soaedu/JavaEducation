package enterprise_patterns.service_locator;

import enterprise_patterns.service_locator.service_locator.Service;
import enterprise_patterns.service_locator.service_locator.ServiceLocator;

public class ServiceLocatorMain {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}

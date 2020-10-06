package enterprise_patterns.business_delegate;

import enterprise_patterns.business_delegate.business_delegate.BusinessDelegate;
import enterprise_patterns.business_delegate.business_delegate.Client;

public class BusinessDelegateMain {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}

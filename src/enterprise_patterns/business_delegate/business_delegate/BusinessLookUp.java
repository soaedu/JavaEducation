package enterprise_patterns.business_delegate.business_delegate;

public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType) {
        if(serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}

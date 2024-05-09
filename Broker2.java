// Parent class
class StockBroker {
    protected String name;
    protected String licenseNumber;

    public StockBroker(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public void displayBrokerInfo() {
        System.out.println("Name: " + name);
        System.out.println("License Number: " + licenseNumber);
    }
}

class FullServiceBroker extends StockBroker {
    private double commissionRate;

    public FullServiceBroker(String name, String licenseNumber, double commissionRate) {
        super(name, licenseNumber);
        this.commissionRate = commissionRate;
    }

    public void displayCommissionRate() {
        System.out.println("Commission Rate: " + commissionRate);
    }
}

class DiscountBroker extends StockBroker {
    private double discountRate;

    public DiscountBroker(String name, String licenseNumber, double discountRate) {
        super(name, licenseNumber);
        this.discountRate = discountRate;
    }

    public void displayDiscountRate() {
        System.out.println("Discount Rate: " + discountRate);
    }
}
class BusinessBroker extends StockBroker{
    private double successRate;
    
    public BusinessBroker(String name, String licenseNumber,double successRate)
    {
        super(name, licenseNumber);
        this.successRate=successRate;
    }
    public void displaySuccessRate()
    {
        System.out.println("Success Rate : "+successRate);
    }
}

public class Broker2{
    public static void main(String[] args) {
        FullServiceBroker fullServiceBroker = new FullServiceBroker("John Sena", "FSB123", 1.5);
        DiscountBroker discountBroker = new DiscountBroker("Thala", "DB456", 0.5);
        BusinessBroker businessBroker = new BusinessBroker("SK","SK2002",99.99);

        System.out.println("Full Service Broker:");
        fullServiceBroker.displayBrokerInfo();
        fullServiceBroker.displayCommissionRate();
        
        System.out.println();
        System.out.println("Discount Broker:");
        discountBroker.displayBrokerInfo();
        discountBroker.displayDiscountRate();
        
        System.out.println();
        System.out.println("Buisness Broker:");
        businessBroker.displayBrokerInfo();
        businessBroker.displaySuccessRate();
    }
}

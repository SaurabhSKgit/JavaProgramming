abstract class RBI{
    RBI(){
    super();
    }
    abstract void rateOfInterest();
    abstract void withdrawLimit();
    abstract void depositeLimit();
}
abstract class SBI extends RBI{
    String accountType;
    String userName;
    SBI(String accountType,String userName)
    {
        super();
        this.accountType=accountType;
        this.userName=userName;
    }
    public void displayDetails()
    {
        System.out.println("account type :"+this.accountType);
        System.out.println("account holder name :"+this.userName);
    }
}
class Saving extends SBI{

    Saving(String accountType, String userName) {
        super(accountType, userName);
    }

    void rateOfInterest()
    {
        System.out.println("roi is : 8%");        
    }
    void withdrawLimit()
    {
        System.out.println("withdraw limit : 50000");
    }
    void depositeLimit()
    {
        System.out.println("deposit limit : 100000");

    }
}

class MainRbiDriver {
    public static void main(String[] args) {
        Saving obj=new Saving("Saving", "SK");
        obj.displayDetails();
        obj.rateOfInterest();
        obj.withdrawLimit();
        obj.depositeLimit();
    }
    
}

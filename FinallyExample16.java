class FinallyExample16 {
    public static void main(String[] args) {
        System.out.println("EXEC STARTS");
        try{
            Thread.currentThread().join();
        }
        catch(InterruptedException IE)
        {
            System.out.println("IE HANDLED");
        }
        finally{
            System.out.println("hlo from finally");
        }
        System.out.println("exc ends");
    }    
}
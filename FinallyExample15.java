class FinallyExample15 {
    public static void main(String[] args) {
        System.out.println("EXEC STARTS");
        try{
            System.out.println("try");
            Thread.sleep(3000);
        }
        catch(InterruptedException IE)
        {
            System.out.println("IE HANDLED");
            System.exit(0);
        }
        finally{
            System.out.println("hlo from finally");
        }
        System.out.println("exc ends");
    }    
}
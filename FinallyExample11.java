class FinallyExample11{
    public static void main(String[] args) {
        System.out.println("EXEC STARTS");
        try{
            Thread.sleep(1000);
        }
        catch(RuntimeException re){
            System.out.println("RE HANDLED");
        }
        catch(InterruptedException IE)
        {
            System.out.println("IE HANDLED");
        }        
        System.out.println("exc ends");
    }    
}
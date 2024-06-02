class FinallyExample10 {
public static void main(String[] args) {
    try{
        System.out.println("hi from try");
        Thread.sleep(1000);
    }
    catch(InterruptedException IE){
        System.out.println("Interrupted Exception handled");
    }
    catch(Exception e)
    {
        System.out.println("Exception handled");
    }
    catch(RuntimeException RE)
    {
        System.out.println("RuntimeException handled");
    }
}
    
}
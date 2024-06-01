class FinallyExample3
{
    public static void main(String[] args) {
        System.out.println("exc starts");
        m1();
        System.out.println("exc ends");
    }
    static void m1()
    {
        System.out.println("m1() starts");
        try{
            System.out.println("try");
            return;
        }
    catch(ArithmeticException AE)
    {
        System.out.println("AE handled");
    }
    finally{
        System.out.println("hello finally");
    }    
    System.out.println("m1() ends");
}
}

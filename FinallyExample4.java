class FinallyExample4
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
            System.out.println(10/0);
        }
    catch(ArithmeticException AE)
    {
        System.out.println("AE handled");
        return;
    }
    finally{
        System.out.println("hello finally");
    }    
    System.out.println("m1() ends");
}
}

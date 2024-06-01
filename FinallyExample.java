class FinallyExample {
    public static void main(String[] args) {
        try{
            System.out.println("outer try");
            try{
                System.out.println("inner try");
            }
            finally{
                System.out.println("inner finally");
            }
        }

    catch(ArithmeticException AE)
    {
        System.out.println("outer catch 1");
    }    
    catch(Exception E)
    {
        System.out.println("outer catch 2");
    }
    finally{
        System.out.println("outer finally");
        System.out.println(10/0);
    }
}
}

class FinallyExample13 {
    public static void main(String[] args) {
        try{
            System.out.println("hi from try");
            try{
                System.out.println("inner try");
                System.out.println(10/0);
            }
            catch(NullPointerException NPE)
            {
                System.out.println("INNER NPE HANDLED");
            }
        }
        catch(ArithmeticException ae)
        {
            System.out.println("hi from AE catch");
        }
    }        
}

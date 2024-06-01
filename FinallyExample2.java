class FinallyExample2{
    public static void main(String[] args) {
        try{
            System.out.println("outer try");
            System.out.println(10/0);

        }
    
    catch(ArithmeticException AE)
    {
        System.out.println("outer catch 1");
        try{
            System.out.println("inner try");
            System.out.println(10/0);
        }
        catch(NullPointerException NPE){
            System.out.println("inner catch");
        }
        finally{
            System.out.println("inner finally");
        }
    }    
    catch(Exception E)
    {
        System.out.println("outer catch 2");
    }
    finally{
        System.out.println("outer finally");
    }
}
}

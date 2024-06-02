class FinallyExample12{
    public static void main(String[] args) {
        try{
            System.out.println("hlo from try");
            String str=null;
            System.out.println(str.isEmpty());
        }
        catch(ArithmeticException AE){
            System.out.println("AE HANDLED");
        }
        catch(RuntimeException re){
            System.out.println("RE HANDLED");
        }
        catch(NullPointerException NPE)
        {
            System.out.println("NPE HANDLED");
        }        
        System.out.println("exc ends");
    }    
}
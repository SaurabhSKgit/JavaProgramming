class FinallyExample8 {
        public static void main(String[] args) {
            try{
                System.out.println("outer try");
                try{
                    System.out.println("inner try");
                }
                catch(NullPointerException NPE){
                    System.out.println("inner catch");
                }
                finally{
                    System.out.println("inner finally");
                    System.out.println(10/0);
                }
            }
            catch(ArithmeticException AE){
                System.out.println("outer catch 1");
            }
            catch(Exception e){
                System.out.println("outer catch 2");
            }
            finally{
                System.out.println("outer finally");
            }
        }
}

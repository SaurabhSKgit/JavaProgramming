class FactorialRec{
    static int fact=1;
    public static void main(String[] args) {
        factorial(5);
        System.out.println(fact+" ");
    }
    public static void factorial(int num){

        fact=fact*num;
        num--;
        if(num==0){
            return;
        }
        factorial(num);
    }
}

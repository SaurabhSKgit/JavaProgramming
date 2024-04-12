class PrimeLoop {

    static int num=2;
    public static void main(String[]a){
        
        int count=0;

        for(int i=2;count!=10;i++){
            if(prime()){
                System.out.print(num+" ");
                count++;
            }
            num++;
        }
    }
    public static boolean prime(){
        boolean flag=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    } 
}

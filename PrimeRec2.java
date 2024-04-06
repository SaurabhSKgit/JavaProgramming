import java.util.*;
class PrimeRec2 {

    static int num;
    static int i=2;
    static boolean flag=true;

    public static void main(String[] args) {
        System.out.print("enter a number : ");
        Scanner sc=new Scanner(System.in);
         num=sc.nextInt();
         prime();
         System.out.println(flag?num+" is prime number":num+" is not a prime number");
    }
    public static void prime(){

        if(i==num)
        return;

        if(num%i==0){
            flag=false;
            return;
        }
        i++;
       
        prime();
    }
    
}

import java.util.*;

class AutomorphicNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number : ");
        int num=sc.nextInt();
        int dup=num;
        int sqr=num*num;
        int div=1;//divisor

        while(num!=0)
        {
            div=div*10;
            num=num/10;
        }
        int lastTwoDigit=sqr%div;
        System.out.println((dup==lastTwoDigit)?dup+" IS AUTOMORPHIC":dup+" IS NOT AUTOMORPHIC");
        //System.out.println(sqr);
        //System.out.println(ld);
    }    
}

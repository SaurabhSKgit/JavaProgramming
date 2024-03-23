import java.util.Scanner;
class Rev100{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int num=sc.nextInt();
        String rev="";

        while(num>0)
        {
            int rem=num%10;
            rev=rev+rem;
            num/=10;
        }
        System.out.println(rev);
    }
    
}

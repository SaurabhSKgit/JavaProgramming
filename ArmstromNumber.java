import java.util.*;

class ArmstrongNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int dup=num;
        int dup1=num;
        int sum=0;
        int length=0;

        //To check the length of number(no. of digits)
        while(num!=0)
        {
            length++;
            num/=10;
        }
        //System.out.println(length);

        while(dup!=0)
        {
            int rem=dup%10;

            int power=1;
            for(int i=1;i<=length;i++)
            {
                power=power*rem;
            }
            dup=dup/10;
            sum=sum+power;
            
        }
        if(dup1==sum)
        {
            System.out.println("is amstrong number");
        }
        else{
            System.out.println("not an armstrong number");
        }

        
    }
}
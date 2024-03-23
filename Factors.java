import java.util.Scanner;
class Factors{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int num=sc.nextInt();
        System.out.println(num);
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.println(i+" is the factor of "+num);
            }
        }

    }
    
}

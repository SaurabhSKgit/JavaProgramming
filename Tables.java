import java.util.*;
class Tables{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int iNo=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(iNo+"*"+i+"="+(iNo*i));
        }
    }
}
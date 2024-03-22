import java.util.*;

class  PrimeNo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number ");

        int iNo=sc.nextInt();
        boolean flag=true;
        
        for(int i=2;i<iNo;i++)
        {
            if(iNo%i==0){
                flag=false;
                break;
            }
        }
        System.out.println(flag?"Prime":"not prime");
    }
}
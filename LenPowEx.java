//To find Length of number and the value of number raised to its length

import java.util.*;
class LenPowEx{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number ");
        int num=sc.nextInt();
        int dup=num;
        int power=1;
        int iCount=0;
        
        while(dup!=0)
        {
            iCount++;
            dup/=10;
        }
        System.out.println(iCount+" is the length of number");

        for(int i=1;i<=iCount;i++)
        {
            power=power*num;
        }
        System.out.println(power+" is the power of the number");
    }
}

import java.util.*;

class PerfectSqr3{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :");
		int num=sc.nextInt();
        boolean bFlag=false;
        int sqrrt=0;
        for(int i=1;i<=num/2;i++)
        {
            if(i*i==num)
            {
                bFlag=true;
                sqrrt=i;
                break;
            }
        }
        if(bFlag)
        {
            System.out.println(sqrrt+" is a perfect sqr of "+num);
        }
        else{
            System.out.println(num+" do not have any perfect sqrrt");
        }
	}
}

import java.util.*;

class NeonNo{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :");
		int num=sc.nextInt();

		int sqr=num*num;
		int sum=0;

		while(sqr>0)
		{
			int rem=sqr%10;
			sum+=rem;
			sqr/=10;
		}
		System.out.println((sum==num)?num+" is a neon number":num+" is not a neon number");

	}
}

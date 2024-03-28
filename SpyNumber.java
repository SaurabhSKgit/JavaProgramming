//sunny number
import java.util.*;

class SpyNumber{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :");
		int num=sc.nextInt();
        int dup=num;
        int sum=0;
        int mult=1;
        
      while(num!=0)
      {
        int rem=num%10;
        sum=sum+rem;
        mult=mult*rem;

        num=num/10;
      }
      System.out.println((sum==mult)?dup+" is Spy number":dup+" is not a spy number");
	}
}

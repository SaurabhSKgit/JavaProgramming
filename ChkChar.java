import java.util.Scanner;
class ChkChar{
	public static void main(String []ar)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character");
		int charx=sc.next().charAt(0);
		
		if((charx>='A'&&charx<='Z')||(charx>='a'&&charx<='z'))
		{
		System.out.println(charx+" is alphabet");
		}
		else{
		System.out.println(charx+" is not a alphabet");
		}
	}
}
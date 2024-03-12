/*accept a string and chk wether first char is vowel or consonent*/

import java.util.*;
class VowelConso{
public static void main(String []ar)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter a character : ");
	String name=sc.next().toLowerCase();
	char ch=name.charAt(0);
	if((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u'))
	{
	System.out.println("Character "+ch+" is a vowel");
	}
	else{
	System.out.println("Character "+ch+" is a consonent");
	}
}
}
import java.util.*;

class Palindrome1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a name : ");
        String name=sc.next();
        String revname="";
        for(int i=name.length()-1;i>=0;i--)
        {
            revname+=name.charAt(i);
        }
        System.out.println((revname.equals(name))?name+" is Palindrome":name+" is not Palindrome");
    }
    
}

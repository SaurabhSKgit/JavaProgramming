import java.util.*;

class LeapYear{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number : ");
        int iNo=sc.nextInt();

        if(iNo%4==0)
        {
            System.out.println(iNo+" is leap year");
        }
        else{
            System.out.println(iNo+" is not a leap year");
        }
    }
}
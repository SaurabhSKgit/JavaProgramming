import java.util.Scanner;

class AgeException extends ArithmeticException
{
    AgeException(String desc)
    {
        super(desc);
    }
}

class CustomisedExcEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age :");
        int age=sc.nextInt();

        if(age<18)
        {
            throw new AgeException("Age is under 18");
        }else{
            System.out.println("you are eligible");
        }
    }
}

import java.util.Scanner;

class FactorialRec2{
    static int fact=1;
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        factorial(num);
        System.out.println("Factorial of "+num+" is "+fact);
    }
    public static void factorial(int num){

        fact=fact*num;
        num--;
        if(num==0){
            return;
        }
        factorial(num);
    }
}

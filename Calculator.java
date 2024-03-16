import java.util.*;

class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the operation u want to perform : ");
        char op=sc.next().charAt(0);

        System.out.print("enter num 1 : ");
        double num1=sc.nextDouble();

        System.out.print("enter num 2 : ");
        double num2=sc.nextDouble();

        double dAns=0.0;
        boolean flag=true;

        switch(op)
        {
            case '+':dAns=num1+num2;break;
            case '-':dAns=num1-num2;break;
            case '*':dAns=num1*num2;break;
            case '/':dAns=num1/num2;break;
            case '%':dAns=num1%num2;break;

            default:System.out.println(op+" is not allowed");flag=false;break;
        }
        if(flag){
        System.out.println(num1+" "+op+" "+num2+" = "+dAns);
        }
    }    
}

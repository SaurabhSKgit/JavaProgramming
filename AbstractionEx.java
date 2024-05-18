abstract class Arithmatic{
    abstract int addition(int num1,int num2);
    abstract int substraction(int num1,int num2);
    abstract int multiplication(int num1,int num2);
    abstract double division(int num1,int num2);
} 
class Child1 extends Arithmatic{
    int addition(int num1,int num2)
    {
        return (num1+num2);
    }
    int substraction(int num1,int num2)
    {
        return(num1-num2);
    }
    int multiplication(int num1,int num2)
    {
       return(num1*num2); 
    }
    double division(int num1,int num2)
    {
        return(num1/num2);
    }

}


class AbstractionEx {
    public static void main(String[] args) {
        Child1 obj=new Child1();
    
        System.out.println("addition is :"+obj.addition(5,5));
        System.out.println("substraction is :"+obj.substraction(10, 3));
        System.out.println("multiplication is :"+obj.multiplication(5, 5));
        System.out.println("division is :"+obj.division(10,5));
    }    

  
}

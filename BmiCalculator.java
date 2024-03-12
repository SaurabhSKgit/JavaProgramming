import java.util.Scanner;

class BmiCalculator{
    public static void main(String []ar)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter weight in pounds :");
        double weightInPounds=sc.nextDouble();

        System.out.print("Enter height in inches :");
        double heightInInches=sc.nextDouble();

        double weightInKg=(weightInPounds*0.45359237);
        double heightInMeter=(heightInInches*0.0254);

        double iAns=(weightInKg/(heightInMeter*heightInMeter));
        System.out.print("The BMI is : "+iAns);
    }
}
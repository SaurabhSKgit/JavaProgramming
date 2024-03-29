import java.util.Scanner;
class UrbanFunds{
    static String name;
    static String address;
    static long phoneNo;
    static long adharNo;
    static Double bal;
    static int upiPin;

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        outerloop:
        for(;;)
        {
            System.out.println("******Welcome*******");
            System.out.println();
            System.out.println("1.Created Account");
            System.out.println("2.Existing account holder");
            System.out.println("enter your option : ");
            int opt =sc.nextInt();
            System.out.println();

            switch(opt)
            {
                case 1:{
                    System.out.println("*****Created Account Feature******");
                    sc.nextLine();
                    System.out.print("Enter your name : ");
                    name=sc.nextLine();
                    System.out.print("Enter your address : ");
                    address=sc.nextLine();
                    System.out.print("Enter your adhar card number : ");
                    adharNo=sc.nextLong();
                    System.out.print("Enter Deposit Amount : ");
                    bal=sc.nextDouble();
                    System.out.println("create new UPI Pin : ");
                    upiPin=sc.nextInt();

                    System.out.println("Account created successfully ");
                    System.out.println();
                    break;
                }
                case 2:{
                    for(;;){
                        System.out.println();
                        System.out.println("****Features****");
                        System.out.println("1. Check Balance ");
                        System.out.println("2. Deposit Amount");
                        System.out.println("3.WIthdraw Amount");
                        System.out.println("4.Information");
                        System.out.println("5.Log out");
                        System.out.print("enter your option : ");
                        int option = sc.nextInt();

                        switch(option){
                            case 1:{
                                System.out.println("check balance");
                                System.out.print("enter your UPI Pin :");
                                int userPin=sc.nextInt();
                                if(userPin==upiPin)

                                System.out.println("your account balance is:"+bal+" Rs");
                                else{
                                    System.out.println("wrong upi Pin");
                                }
                                break;
                            }
                            case 2:{
                            System.out.println(" Deposit Amount ");
                            System.out.println();
                            System.out.print("Enter your Amount : ");
                            double depAmount=sc.nextDouble();
                            bal=bal+depAmount;
                            System.out.println("Amount Deposit successfully");
                            break;
                        }
                        case 3:{
                            System.out.println("Withdrawn");
                            System.out.println();
                            System.out.print("enter a amount : ");
                            double withAmount=sc.nextDouble();
                            System.out.print("enter your upi pin : ");
                            int upiPin=sc.nextInt();
                            if(withAmount<=bal)
                            {
                                System.out.println("Amount withdrawn successfully ");
                                bal=withAmount;
                            }
                            else{
                                System.out.println("insufficient amount ");
                            }
                            break;
                        }
                        case 4:{
                            System.out.println("account info");
                            System.out.println();
                            System.out.println("account holder name :"+name);
                            System.out.println("address :"+address);
                            System.out.println("phone number :"+phoneNo);
                            System.out.println("adhar card number :"+adharNo);
                            break;
                        }
                        case 5:{
                            System.out.println("logout");
                            System.exit(0);
                        }
                        default:System.out.println("invalid option");
                        break;
                    }
                }
            }
            default:System.out.println("invalid option");
            break;
            
        }
    }
}
}
import java.util.Scanner;

class Election{
    public static void main(String []ar)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age:");
        double age=sc.nextDouble();

        if(age>=18)
        {
            System.out.println("Do have a voter id (yes/no) : ");
            String voterId=sc.next().toLowerCase();
            if(voterId.equals("yes"))
            {
                System.out.println("***WELCOME***");
                System.out.println("    ");
                System.out.println("1. BJP");
                System.out.println("2. Congress");
                System.out.println("3. AAP");
                System.out.println("4. MNS");
                System.out.println("5. Shivsena");
                System.out.println("6. NCP");
                System.out.println("7. NOTA");

                System.out.print("Enter the option to vote for your fav party ");
                String vote=sc.next().toUpperCase();
                if(vote.equals("BJP")){
                    System.out.println("U hae voted for BJP");
                }else if(vote.equals("CONGRESS")){
                    System.out.println("voted for CONGRESS");
                }else if (vote.equals("AAP")){
                    System.out.println("u voted for AAP");
                }else if(vote.equals("MNS")){
                    System.out.println("voted for MNS");
                }else if(vote.equals("SHIVSENA")){
                    System.out.println("voted for SHIVSENA");
                }else if(vote.equals("NCP")){
                    System.out.println("voted for NCP");
                }else if(vote.equals("NOTA")){
                    System.out.println("u Wasted A vote");
                }else{
                    System.out.println("INVALID INPUT");
                }
            }else{
                System.out.println("voter id is mandatory");
            }
        }else{
            System.out.println("u can vote after "+(18-age)+" years");
        }
        
    }
}
import java.util.*;

class Seasons{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a month");
        String name=sc.next().toLowerCase();

        switch (name) {
            case "nov":
            case "dec":
            case "jan":
            case "feb":System.out.println(name+" is winter season");break;
            case "mar":
            case "apr":
            case "may":
            case "june":System.out.println(name+" is summer season");break;
            case "july":
            case "aug":
            case "sept":
            case "oct":System.out.println(name+" is winter season");break;

            default:System.out.println("invalid input");
                break;
        }
    }
}
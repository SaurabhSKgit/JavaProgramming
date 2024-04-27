import java.util.*;

class CapCount
{
    public static void main(String Ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please string : ");
        String str = sobj.nextLine();

        int iCnt=0;
        
        char Arr[] = str.toCharArray();

        for(int i=0;i<Arr.length;i++){
           if((Arr[i]>='A')&&(Arr[i]<='Z')){
            iCnt++;
           }
        }
        System.out.println("there are "+iCnt+" capital letters in string");
    }
}
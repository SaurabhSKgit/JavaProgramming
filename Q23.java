import java.util.*;
class Q23 {
    public static void main(String []a)
    {
        int arr[]=new int[10];
        int n=2;
        
        for(int i=0;i<arr.length;)
        {
            if(isPrime(n))
            {
                arr[i++]=n;
            }
            n++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static boolean isPrime(int num)
    {         
            for(int j=2;j<num;j++)
            {
                if(num%j==0)
                {
                    return false;
                }
            }
            return true;
    } 
}

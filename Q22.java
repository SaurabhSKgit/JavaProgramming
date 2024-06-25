/*
 * 22.Find even elements and store it in a new array.
Ip : a={1, 2, 3, 4, 5, 6}
Op :b={2,4,6}
 */
import java.util.Arrays;

class Q22 {
    public static void main(String[] args) {
        int a[]={1, 2, 3, 4, 5, 6,7};
        int  count=0;
        int j=0;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                count++;
            }
        }
        int a2[]=new int[count];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                a2[j]=a[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(a2));
        
    }
}

// 25.Find first 10 Fibonacci numbers and store it in an array.
// Op :a={0,1,1,2,3,5,8,13,21,34}

import java.util.*;

class Q25 {
    public static void main(String[] args) {
        int arr[]=new int[10];
        arr[0]=0;
        arr[1]=1;


        for(int i=2;i<arr.length;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
    }
}

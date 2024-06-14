//wajp to fetch second largest element in the array

import java.util.Arrays;
import java.util.Scanner;

class SecondLargestArr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.print("Enter size of array :");
            int size=sc.nextInt();
            
            int []arr=new int[size];
            System.out.print("enter the elements :");
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            
            System.out.println("Second largest element in array is : "+arr[size-2]);       
    }
}
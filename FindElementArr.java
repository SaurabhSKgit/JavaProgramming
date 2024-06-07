//wajp to find a element in array

import java.util.*;

class FindElementArr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=true;

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] num = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();  // Read elements and store them in the array
        }
        
        System.out.print("enter the number to find :");
        int a=sc.nextInt();

        for(int i=0;i<num.length;i++)
        {
            if(num[i]==a)
            {
                System.out.println("element found at position :"+(i+1));
                flag=false;
                break;
            }
        }
        if(flag)
        {
            System.out.println("element not found");
        }
        
    }
}
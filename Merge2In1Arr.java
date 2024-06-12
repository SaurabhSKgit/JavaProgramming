//wajp to merge 2 arrays in 1 single array

import java.util.*;
class Merge2In1Arr{
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={6,7,8,9,10};

        int cnt1=arr1.length;
        int cnt2=arr2.length;

        int cnt3=cnt1+cnt2;

        int []Farr=new int[cnt3];
        int j=0;

        for(int i=0;i<cnt1;i++)
        {
            Farr[j]=arr1[i];
            j++;
        }
        for(int i=0;i<cnt2;i++)
        {
            Farr[j]=arr2[i];
            j++;
        }

        System.out.println(Arrays.toString(Farr));
        
    }
}
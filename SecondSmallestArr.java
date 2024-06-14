//wajp to fetch second smallest element in the array
import java.util.*;
class SecondSmallestArr{
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
            // System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);
            // System.out.println(Arrays.toString(arr));
            System.out.println("Second smallest element in array is : "+arr[1]);
            
            
            
            
            // int arr[]={9,3,7,6,4};
    
            // System.out.println("Original array: " + Arrays.toString(arr));
    
            // Arrays.sort(arr);
    
            // System.out.println("Sorted array: "+Arrays.toString(arr));
            // int Farr[]=arr;
            // //System.out.println(Farr.length);
            // int size=Farr.length;
            // System.out.println(Farr[1]);
           
            
        }
    }
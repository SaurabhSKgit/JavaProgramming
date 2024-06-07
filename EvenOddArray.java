//wajp to find even and odd numbers in an array using first syntax
class EvenOddArray{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};

        System.out.println("odd elements in array are :");
        for(int a=0;a<arr.length;a++)
        {
            if(arr[a]%2==1)
            {
                System.out.print(arr[a]+" ");
            }    
        }
        System.out.println();
    }
}
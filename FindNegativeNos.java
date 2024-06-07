//wajp to fetch the -ve numbers in an array
class FindNegativeNos{
    public static void main(String[] args) {
        int num[]={1,2,-1,-2,0};

        System.out.print("Negative numbers in array are :");
        for(int i=0;i<num.length;i++)
        {
            if(num[i]<0)
            {
                System.out.print(num[i]);
            }
        }
        System.out.println();
    }
}
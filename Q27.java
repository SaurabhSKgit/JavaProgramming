// 27.Find sum of all elements at odd indices in an array.
// Ip : a={6,5,4,3,7,8,0}
// Op : 17
class Q27 {
    public static void main(String[] args) {
        int arr[]={6,5,4,3,7,8,0};

        int ans=0;

        for(int i=0;i<arr.length;i++)
        {
            if(i%2!=0)
            {
                ans=ans+arr[i];
            }
        }
        System.out.println("addition at odd index :"+ans);
    }
}

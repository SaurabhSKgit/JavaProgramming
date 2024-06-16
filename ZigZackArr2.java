import java.util.Arrays;

class ZigZackArr2 {
    public static void main(String[] args) {
        int []b={1,2,3};
        int []a={4,5,6,7,8,9};

        int max=((a.length)>(b.length))?a.length:b.length;
        int c[]=new int[(a.length)+(b.length)];

        int indx=0;
        for(int i=0;i<max;i++)
        {
            if(i<b.length)
            c[indx++]=b[i];
            c[indx++]=a[i];
        }
        System.out.println(Arrays.toString(c));
    }    
}

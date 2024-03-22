class NumPatternPrac{
    public static void main(String[] args) {
        int start=0,s1=1,end=1,e1=0;

        for(int i=1;i<=5;i++)
        {
            start=start+s1;
            end=end+e1;
            for(int j=start;j>=end;j--)
            {
                System.out.print(j+" ");
            }
            s1++;
            e1++;
            System.out.println(" ");
        }
    }
}
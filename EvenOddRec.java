class EvenOddRec {
    
    static int i=0;
    static int j=0;
    public static void main(String[] args) {
        System.out.print("Even Numbers Are : ");
        Onum();
        System.out.println();
        System.out.println("odd numbers are : ");
        EnumX();
        System.out.println();
    }
    public static void Onum()
    {
        
        if(i%2==0){
            System.out.print(i+" ");
        }
        i++;
        if(i>100){
            return;
        }
        Onum();
    }
    public static void EnumX()
    {
        if(j%2==1){
            System.out.print(j+" ");
        }
        j++;
        if(j>100){
            return;
        }
        EnumX();
    }
}


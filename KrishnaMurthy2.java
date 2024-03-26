class KrishnaMurthy2{
    public static void main(String[] args) {

        //int Digit;
        
        for(int j=1;j<=50000;j++)
        {   int num=j;
            int sum=0;
            int dup=num;
        while(dup>0)
        {
            int rem=dup%10;
            
            int fact=1;
            for(int i=1;i<=rem;i++)
            {
                fact=fact*i;
                //System.out.println(fact);
            }
            sum=sum+fact;

            dup=dup/10;
        }
        if(sum==num)
        System.out.println(num);
    }
    }
    
}


class FinallyExample6{
    public static void main(String[] args) 
    {
        System.out.println("exc starts");
        int i=1;
        while(i<=10);
        {
            System.out.println(i);
            i++;
        }
        try{
            System.out.println("try bye");
            System.out.println(10/0);
        }
        finally{
            System.out.println("hello from finally");
        }
    }
}        

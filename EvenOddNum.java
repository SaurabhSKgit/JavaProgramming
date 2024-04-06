class EvenOddNum {
    static int num=1;
    static int num1=1;
    public static void main(String[] args) 
        {
            System.out.println("even numbers :");
            evenNumbers();
            System.out.println();

            System.out.println("odd numbers : ");
            oddNum();
            System.out.println();
        }
        public static void evenNumbers(){
            if(num%2==0){
                System.out.print(num+" ");
            }
            num++;
            if(num>10){
                return;
            }
            evenNumbers();
        }
        public static void oddNum(){
            if(num1%2==1){
                System.out.print(num1+" ");
            }
            num1++;
            if(num1>10){
                return;
            }
            oddNum();
        } 
    }


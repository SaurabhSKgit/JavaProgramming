class ThisEx2 {
    String str="hi i am global variable";
    
    void m1(){
        System.out.println("hi from m1()");
    }
    void add(int num1,int num2){
        System.out.println("addition is :"+(num1+num2));
    }
    static void m2(){
        System.out.println("ABCD");
    }
    void excControll(){
        String str="hi i am local";
        this.add(20,20);
        this.m2();
        System.out.println(str);
        System.out.println(this);
        System.out.println(this.str);
    }
    public static void main(String[] args) {
        ThisEx2 a=new ThisEx2();
        a.excControll();
        //System.out.println(a);
    }
}

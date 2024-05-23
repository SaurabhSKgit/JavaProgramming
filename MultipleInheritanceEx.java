interface Parent1{
   void m1();
}
interface Parent2{
    void m2();
}

interface child extends Parent1,Parent2{
    void m3();
}

class A implements child{
    public void m1()
    {
        System.out.println("m1() method");
    }

    public void m2()
    {
        System.out.println("m2() method");
    }
    public void m3()
    {
        System.out.println("m3() method");
    }
}

class MultipleInheritanceEx{
    public static void main(String[] args) {
        
        A obj=new A();
        obj.m1();
        obj.m2();
        obj.m3();
        
    }    

}

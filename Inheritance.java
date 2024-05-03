class Parent{
    String str="hi from parent class string variable";

    void m1()
    {
        System.out.println("from parent m1()");
    }
    static void m3()
    {
        System.out.println("from parent static method m3()");
    }
}

class Child extends Parent{
    String str2="hi from child class";
    void m2()
    {   System.out.println(super.str);
        System.out.println("hello from child class m2()");
    }
    static void m4(){
        System.out.println("hello from m4() static method");
    }
}

class Inheritance {
    public static void main(String[] args) {
        Child obj=new Child();
        obj.m2();
        System.out.println(obj.str2);
        obj.m4();

        System.out.println(obj.str);
        obj.m1();
        obj.m3();
    } 
}

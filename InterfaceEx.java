interface Arithmatic{
    int add(int a,int b);
    int multi(int a,int b);
}
class Aimp implements Arithmatic{

    public int add(int a,int b)
    {
        return(a+b);
    }
    public int multi(int a, int b)
    {
        return(a*b);
    }


}

class InterfaceEx {
    public static void main(String[] args) {
        
        Aimp obj=new Aimp();
        System.out.println(obj.add(5, 5));
        System.out.println(obj.multi(5, 5));
    }    

}

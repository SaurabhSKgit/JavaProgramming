class Student{
    String name;
    String place;
    String branch;

    Student(String name,String place,String branch)
    {
        this.name=name;
        this.place=place;
        this.branch=branch;   
    }

    public String toString()
    {
        return "hi my name is "+this.name+", i belong to "+ this.place+" and i am from "+this.branch;    
    }

}
class toStringEx {
        public static void main(String []a)
        {
            Student obj=new Student("sk","pune","cs");
            System.out.println(obj);
        }
}

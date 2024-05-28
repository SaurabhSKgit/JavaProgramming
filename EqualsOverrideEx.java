class Student
{
    String name;
    String place;
    String branch;
    int yop;

    Student(String name,String place, String branch,int yop)
    {
        this.name=name;
        this.place=place;
        this.branch=branch;
        this.yop=yop;
    }
    public boolean equals(Object obj)
    {
        Student obj2=(Student)obj;
        if((this.name==obj2.name))
        return true;
        else
        return false;
    }
}

class EqualsOverrideEx{
    public static void main(String[] args) {
        Student obj1=new Student("sk", "pune", "cs", 2024);
        Student obj2=new Student("kk", "pune", "cs", 2024);
        System.out.println(obj1.equals(obj2));

    }
}






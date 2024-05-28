class human implements Cloneable
 {
    String name;
    String place;
    String gender;
    String profession;
 
 human(String name,String place,String gender,String profession)
 {
     this.name=name;
     this.place=place;
     this.gender=gender;
     this.profession=profession;
 }
 
 public String toString()
 {
     return this.name+" , "+this.place+" , "+this.gender+" , "+this.profession;
 }
protected Object clone() throws CloneNotSupportedException
{
    return super.clone();
}

 }
 class CloneExDriver{
     public static void main(String[] args) throws CloneNotSupportedException
     {
         human obj1=new human("sk","pune","male","eng");
         System.out.println(obj1);

         human obj2=(human)obj1.clone();
         System.out.println(obj2);
     }
 }
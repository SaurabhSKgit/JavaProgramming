class University{
    String name;
    String universityCode;
    int noOfColleges;
    String type;
    int establishedYear;
    int cources;
    College college1;
    
    University(String name, String universityCode,int noOfColleges, String type,int establishedYear,int cources)
    {
        this.name=name;
        this.universityCode=universityCode;
        this.noOfColleges=noOfColleges;
        this.type=type;
        this.establishedYear=establishedYear;
        this.cources=cources;
    }
    public void displayUniversity()
    {
        System.out.println("Name : "+this.name);
        System.out.println("university code : "+this.universityCode);
        System.out.println("no of colleges : "+this.noOfColleges);
        System.out.println("Type : "+this.type);
        System.out.println("established year : "+this.establishedYear);
        System.out.println("Cources : "+this.cources);
    }

    public void createInstanceOfCollege(String name,String collegeCode,String address,int noOfDept,int staffCount,char grade)
    {
        college1=new College(name,collegeCode, address,noOfDept,staffCount, grade);
    }
}
class College{
    String name;
    String collegeCode;
    String address;
    int noOfDept;
    int staffCount;
    char grade;
    Department department;

    College(String name,String collegeCode,String address,int noOfDept,int staffCount,char grade)
    {
        this.name=name;
        this.collegeCode=collegeCode;
        this.address=address;
        this.noOfDept=noOfDept;
        this.staffCount=staffCount;
        this.grade=grade;
    }
    public void displayCollege()
    {
        System.out.println();
        System.out.println("Name of clg : "+this.name);
        System.out.println("College code : "+this.collegeCode);
        System.out.println("Address : "+this.address);
        System.out.println("no of dept : "+this.noOfDept);
        System.out.println("Staff Count : "+this.staffCount);
        System.out.println("Grade : "+this.grade);
    }
    public void createInstanceOfDept(String name,String hodName,int classroom,int noOfStaff,int noOfSubjects) 
    {
        department=new Department(name, hodName, classroom, noOfStaff, noOfSubjects);
    }
}
class Department{
    String name;
    String hodName;
    int classroom;
    int noOfStaff;
    int noOfSubjects;
    Teacher teacher;

    Department(String name,String hodName,int classroom,int noOfStaff,int noOfSubjects)
    {
        this.name=name;
        this.hodName=hodName;
        this.classroom=classroom;
        this.noOfStaff=noOfStaff;
        this.noOfSubjects=noOfSubjects;
    }
    public void displayDepartment()
    {
        System.out.println();
        System.out.println("Dept name : "+this.name);
        System.out.println("Head : "+this.hodName);
        System.out.println("classrooms : "+this.classroom);
        System.out.println("staffs : "+this.noOfStaff);
        System.out.println("Subjects : "+this.noOfSubjects);
    }
    public void createInstanceOfTeacher(String name,String subjects,long phoneNumber,String qualification,double experience)
    {
        teacher=new Teacher(name,subjects,phoneNumber,qualification,experience);
    }
}
class Teacher{
    String name;
    String subjects;
    long phoneNumber;
    String qualification;
    double experience;

    Teacher(String name,String subjects,long phoneNumber,String qualification,double experience)
    {
        this.name=name;
        this.subjects=subjects;
        this.phoneNumber=phoneNumber;
        this.qualification=qualification;
        this.experience=experience;
    }
    public void displayTeacher()
    {
        System.out.println();
        System.out.println("Teacher Name : "+this.name);
        System.out.println("Subjects : "+this.subjects);
        System.out.println("Phone Number : "+this.phoneNumber);
        System.out.println("Qualifications : "+this.qualification);
        System.out.println("Experiance : "+this.experience);
    }
}
class UniversityDriver {
    public static void main(String[] args) {
        University obj=new University("SPPU", "UNI123", 1100, "Govt", 1950, 300);
        obj.displayUniversity();
        obj.createInstanceOfCollege("APCOER", "APCOER123","Pune", 8, 16, 'A');
        obj.college1.displayCollege();
        obj.college1.createInstanceOfDept("aiml", "ghule", 8, 8, 48);
        obj.college1.department.displayDepartment();
        obj.college1.department.createInstanceOfTeacher("Sudarshan", "JAVA", 939584755, "MTECH", 5.5);
        obj.college1.department.teacher.displayTeacher();
    }
    
}

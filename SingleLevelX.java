import java.util.Arrays;

class ProgrammingLanguage{
    String type;
    String level;
    int  inventedYear;
    String founderName;
    double latestVersion;
    String extension;

    ProgrammingLanguage(String type, String level,int inventedYear,String founderName,double latestVersion,String extension)
    {
        super();
        this.type=type;
        this.level=level;
        this.inventedYear=inventedYear;
        this.founderName=founderName;
        this.latestVersion=latestVersion;
        this.extension=extension;
    }

    public void displayProgrammingLanguage(){
        System.out.println("**** Programming Languages ****");
        System.out.println("Type : "+type);
        System.out.println("level : "+level);
        System.out.println("Invented in : "+inventedYear);
        System.out.println("Founder name : "+founderName);
        System.out.println("latest version : "+latestVersion);
        System.out.println("extension : "+extension);
    }
}

class Java extends ProgrammingLanguage{
    String []features;
    boolean platformIndependent;

    Java(String []features, boolean platformIndependent,String type,String level,int inventedYear,String founderName,double latestVersion,String extension)
    {
        super(type,level,inventedYear,founderName,latestVersion,extension);
        this.features=features;
        this.platformIndependent=platformIndependent;
    }
    public void displayJava()
    {
        System.out.println();
        System.out.println("**** JAVA ****");
        System.out.println("Is it platform independent : "+this.platformIndependent);
        System.out.println("Features of Java : "+Arrays.toString(this.features));
    }
}

class SingleLevelX {
    public static void main(String[] args) {
        String[]features={"1.multithreaded, 2.secure and robust, 3.Portable ,4.Dynamic"};
        Java obj=new Java(features,true,"object oriented","high level",1991,"James gosling",22.0," Extension");
        obj.displayProgrammingLanguage();
        obj.displayJava();
    }
    
}

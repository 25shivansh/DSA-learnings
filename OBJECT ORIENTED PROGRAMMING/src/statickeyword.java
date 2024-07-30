public class statickeyword {
    public static void main(String[] args) {
        Student1 s1=new Student1();
        s1.schoolname="GNES";
        Student1 s2=new Student1();
        //s2.schoolname="bca";
        System.out.println(s2.schoolname);
        Student1 s3=new Student1();
        s3.schoolname="ABC";


    }
}
class Student1{
    static int returnpercentage(int math,int phy,int chem){
        return (math+phy+chem)/3;
    }
    String name;
    int roll;
    static String schoolname;
    void setname(String name){
        this.name=name;
    }
}

public class OOPS {
    public static void main(String[] args) {
        pen p1=new pen();//created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("yellow") ;
        System.out.println(p1.getColor());
    }
}
class pen{
    private String color;
    private int tip;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newcolor){
        this.color=newcolor;
    }
    void setTip(int Tip){
        this.tip=Tip;
    }
}
class student{
    String name;
    int age;
    float percentage;//cgpa
    void calcPercentage(int phy,int chem,int math){
        percentage=(phy+chem+math)/3;
    }

}

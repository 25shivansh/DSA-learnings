public class abstractmethod {
    public static void main(String[] args) {
        horse h=new horse();
        h.eat();
        h.walk();
        chicken c=new chicken();
        c.eat();
        c.walk();

    }
}
abstract class animal2{
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class horse extends animal{
    void walk(){
        System.out.println("WAlks on 4 legs");
    }
}
class chicken extends animal{
    void walk(){
        System.out.println("WALKS ON 2 LEGS");
    }
}

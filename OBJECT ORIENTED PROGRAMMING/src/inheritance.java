public class inheritance {
    public static void main(String[] args) {
        dog dobby=new dog();
        dobby.breed="labrador";
        System.out.println(dobby.breed);
        cat billorani=new cat();
        billorani.breed="PERSIAN";
        System.out.println(billorani.breed);
        human person=new human();
        person.name="SHIVANSH SINGH RAJPUT";
        peacock.definecolor();
        tuna.figure();
        shark.definefigure();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
//        fish shark=new fish();
//        shark.eat();


    }
}
//BASE CLASS
class animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
//DERIVED CLASS/SUB-CLASS
class fish extends animal{
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}
//MULTI-LEVEL INHERITANCE EXAMPLES
class mammals extends animal{
    int legs;
}
//ONE MORE DERIVED CLASS
class dog extends mammals{
    String breed;
}
//HYBRID INHERITANCE
class cat extends mammals{
    String breed;
}
class human extends mammals{
    String name;
}
class bird extends animal{
    String color;
    static void definecolor(){
        System.out.println("BLUE IS BIRD");
    }
}
class peacock extends bird{
    void feathers(){
        System.out.println("very long feathers");
    }
}
class tuna extends fish{
    static void figure(){
        System.out.println("they have round body structure");
    }
}
class shark extends fish{
    static void definefigure(){
        System.out.println("skeleton structure");
    }
}

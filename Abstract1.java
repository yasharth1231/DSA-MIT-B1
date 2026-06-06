abstract class Animal{
    int no_of_legs;
    String color;
    String modes_of_food;

    void eat(){
        System.out.println("Eating time.... dont disturb me!");
    }
    void sleep(){
        System.out.println("Sleeping");
    }
    abstract void speak();
}
class Rabbit extends Animal{
    void speak(){
        System.out.println("Rabbit is saying.....something");
    }

    void jumping(){
        System.out.println("Rabbit is jumping");
    }

}
abstract class Bird extends Animal{
    void fly(){
        System.out.println("Flying");
    }
    void migrate(){
        System.out.println("Migrating");
    }
    abstract void displayname();
}

class Koyal extends Bird{
    void speak(){
        System.out.println("Koo");
    }
    void displayname(){
        System.out.println("Koyal");
    }
}
public class Abstract1{
    public static void main(String[] args) {
        // Rabbit chiku=new Rabbit();
        // //Animal chiku=new Rabbit();
        // chiku.jumping();
        // chiku.eat();
        // chiku.color="White with black patches";
        // System.out.println(chiku.color);
        Koyal kuku = new Koyal();
        kuku.displayname(); // From Koyal class
        kuku.speak();       // From Koyal class
        kuku.fly();         // Inherited from Bird class
        kuku.sleep();       // Inherited all the way from Animal class
        
        kuku.color = "Black";
        System.out.println("Kuku's color: " + kuku.color);
    }
    
}
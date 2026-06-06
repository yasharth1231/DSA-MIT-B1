class A{
    void greet(){
        System.out.println("Hi from a");
    }
}
class B extends A{
    void greet(){
        System.out.println("Hi from b");
        super.greet();
    }
}

public class Poly2 {
    public static void main(String[] args) {
        A b= new B();
        b.greet();
    }
    
}

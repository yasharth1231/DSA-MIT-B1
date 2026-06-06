interface A{
    void pay();
    default void display(){
        System.out.println("Hi from A");
    };
}

interface B{
    void pay();
    default void display(){
        System.out.println("Hi from B");
    }
}

class UPI implements A,B{
    public void display(){
        System.out.println("Hi from upi");
        A.super.display();
        B.super.display();
    }
    public void pay(){
        System.out.println("Payment done by upi");
    }
}

public class Interface1 {
    public static void main(String[] args) {
       //UPI user = new UPI();
        B user = new UPI();
        user.pay();
        user.display();
    }
}

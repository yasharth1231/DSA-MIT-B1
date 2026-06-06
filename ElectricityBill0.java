import java.util.Scanner;

public class ElectricityBill0 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int units= sc.nextInt();
        double bill = 50.0;
        if(units<=100){
            bill+=1.5*units;
        }
        else if (units<=200){
            bill+=100*1.5+(units-100)*2.5;
        }
        else {
            bill+=1.5*100 +2.5*100+ 5*(units-200);

        }
        
        System.out.println(bill);

    }
}

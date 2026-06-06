import java.util.Scanner;

class Phone {
    private int phoneId;
    private String os;
    private String brand;
    private int price;

    public Phone(int phoneId, String os, String brand, int price) {
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public String getOs() {
        return os;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
}

public class Tcsipa2 {

    public static int findPriceForGivenBrand(Phone[] phones, String brand) {
        int sum = 0;

        for (Phone p : phones) {
            if (p.getBrand().equalsIgnoreCase(brand)) {
                sum += p.getPrice();
            }
        }

        return sum;
    }

    public static Phone getPhoneIdBasedOnOs(Phone[] phones, String os) {
        for (Phone p : phones) {
            if (p.getOs().equalsIgnoreCase(os) && p.getPrice() >= 50000) {
                return p;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Phone[] phones = new Phone[4];

        for (int i = 0; i < 4; i++) {
            int phoneId = Integer.parseInt(sc.nextLine());
            String os = sc.nextLine();
            String brand = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());

            phones[i] = new Phone(phoneId, os, brand, price);
        }

        String brand = sc.nextLine();
        String os = sc.nextLine();

        int totalPrice = findPriceForGivenBrand(phones, brand);

        if (totalPrice > 0) {
            System.out.println(totalPrice);
        } else {
            System.out.println("The given Brand is not available");
        }

        Phone result = getPhoneIdBasedOnOs(phones, os);

        if (result != null) {
            System.out.println(result.getPhoneId());
        } else {
            System.out.println("No phones are available with specified os and price range");
        }

        sc.close();
    }
}
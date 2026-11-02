package daspro_jobsheet8;
import java.util.Scanner;
public class KafeDoWhile06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coffe, tea, breads;
        int totalPrice, coffePrice = 12000, teaPrice = 7000, breadPrice = 20000;
        String customerName;

        do {
            System.out.print("Enter customer name (type 'cancel' to exit): ");
            customerName = sc.nextLine();
            if (customerName.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction canceled.");
                break;
            }

            System.out.print("Number of coffees: ");
            coffe = sc.nextInt();
            System.out.print("Number of teas: ");
            tea = sc.nextInt();
            System.out.print("Number of breads: ");
            breads = sc.nextInt();

            totalPrice = (coffe * coffePrice) + (tea * teaPrice) + (breads * breadPrice);
            System.out.println("Total to be paid: Rp " + totalPrice);
            sc.nextLine();
        } while (true);

        System.out.println("All transactions completed.");
        sc.close();
    }
    
}

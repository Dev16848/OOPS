import java.util.Scanner;

class BillGenerator {

    int generateBill(int itemTotal) {
        return itemTotal;
    }

    int generateBill(int itemTotal, int discount) {
        return itemTotal - discount;
    }

    double generateBill(int itemTotal, double discountPercent) {
        return itemTotal - (itemTotal * discountPercent / 100);
    }
}

public class MallBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BillGenerator bg = new BillGenerator();

        System.out.print("Enter total item amount: ");
        int total = sc.nextInt();

        System.out.println("Select Customer Type:");
        System.out.println("1. Regular");
        System.out.println("2. Privileged (Flat Discount)");
        System.out.println("3. Festive Offer (Percentage Discount)");
        int choice = sc.nextInt();

        if (choice == 1) {
            int bill = bg.generateBill(total);
            System.out.println("Final Bill Amount: " + bill);
        } 
        else if (choice == 2) {
            System.out.print("Enter flat discount amount: ");
            int disc = sc.nextInt();
            int bill = bg.generateBill(total, disc);
            System.out.println("Final Bill Amount: " + bill);
        } 
        else if (choice == 3) {
            System.out.print("Enter discount percentage: ");
            double percent = sc.nextDouble();
            double bill = bg.generateBill(total, percent);
            System.out.println("Final Bill Amount: " + bill);
        } 
        else {
            System.out.println("Invalid choice.");
        }
    }
}

public class BankAccount2 {

    String accountHolderName;
    double balance;

    static double interestRate = 5.0; // default interest rate (%)

    void assignValues(String name, double bal) {
        accountHolderName = name;
        balance = bal;
    }

    double calculateInterest() {
        return (balance * interestRate) / 100;
    }

    void displayInterest() {
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance : " + balance);
        System.out.println("Interest Rate : " + interestRate + "%");
        System.out.println("Interest Earned: " + calculateInterest());
        System.out.println("--------------------------------");
    }

    static void updateInterestRate(double newRate) {
        interestRate = newRate;
        System.out.println("\nInterest Rate Updated to " + interestRate + "%\n");
    }

    public static void main(String[] args) {

        BankAccount2 acc1 = new BankAccount2();
        BankAccount2 acc2 = new BankAccount2();

        acc1.assignValues("Ravi Kumar", 10000);
        acc2.assignValues("Neha Sharma", 20000);

        System.out.println("Interest Details (Before Rate Change):\n");

        acc1.displayInterest();
        acc2.displayInterest();

        BankAccount2.updateInterestRate(7.5);

        System.out.println("Interest Details (After Rate Change):\n");

        acc1.displayInterest();
        acc2.displayInterest();
    }
}
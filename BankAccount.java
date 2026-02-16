import java.util.Scanner;

class BankAccount {
    String accountId;
    String accountHolderName;
    double balance;

    void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    void displayValues() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    static void searchAccount(BankAccount[] accounts, String id) {
        boolean found = false;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].accountId.equals(id)) {
                System.out.println("Account Found:");
                accounts[i].displayValues();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Account not found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount[] accounts = new BankAccount[5];

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new BankAccount();
            System.out.println("Enter details for Account " + (i + 1));

            System.out.print("Account ID: ");
            String id = sc.nextLine();

            System.out.print("Account Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Balance: ");
            double bal = sc.nextDouble();
            sc.nextLine();

            accounts[i].assignValues(id, name, bal);
            System.out.println();
        }

        System.out.println("All Accounts:");
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].displayValues();
        }

        System.out.print("Enter Account ID to search: ");
        String searchId = sc.nextLine();

        searchAccount(accounts, searchId);
    }
}

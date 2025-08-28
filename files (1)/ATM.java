import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to the Java ATM ===");
        System.out.print("Enter User ID: ");
        String userId = sc.nextLine();

        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();

        User user = bank.authenticate(userId, pin);

        if (user == null) {
            System.out.println("Authentication failed.");
            return;
        }

        System.out.println("Authentication successful. Welcome, " + user.getUserId() + "!");
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ATMOperations.showTransactionHistory(user);
                    break;
                case 2:
                    System.out.print("Amount to withdraw: ");
                    double wAmt = sc.nextDouble();
                    ATMOperations.withdraw(user, wAmt);
                    break;
                case 3:
                    System.out.print("Amount to deposit: ");
                    double dAmt = sc.nextDouble();
                    ATMOperations.deposit(user, dAmt);
                    break;
                case 4:
                    System.out.print("Target User ID: ");
                    String targetId = sc.next();
                    System.out.print("Amount to transfer: ");
                    double tAmt = sc.nextDouble();
                    ATMOperations.transfer(user, bank, targetId, tAmt);
                    break;
                case 5:
                    System.out.println("Thank you for using ATM.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
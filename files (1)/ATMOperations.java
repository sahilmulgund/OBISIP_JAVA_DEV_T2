public class ATMOperations {

    public static void showTransactionHistory(User user) {
        if (user.getTransactions().isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("\nTransaction History:");
            for (Transaction tx : user.getTransactions()) {
                System.out.println(tx);
            }
        }
    }

    public static void withdraw(User user, double amount) {
        if (amount > 0 && user.getBalance() >= amount) {
            user.setBalance(user.getBalance() - amount);
            user.addTransaction(new Transaction("Withdraw", amount, "ATM Withdrawal"));
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + user.getBalance());
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public static void deposit(User user, double amount) {
        if (amount > 0) {
            user.setBalance(user.getBalance() + amount);
            user.addTransaction(new Transaction("Deposit", amount, "ATM Deposit"));
            System.out.println("Deposited: " + amount);
            System.out.println("Current Balance: " + user.getBalance());
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public static void transfer(User user, Bank bank, String targetUserId, double amount) {
        User target = bank.getUser(targetUserId);
        if (target != null && amount > 0 && user.getBalance() >= amount) {
            user.setBalance(user.getBalance() - amount);
            target.setBalance(target.getBalance() + amount);
            user.addTransaction(new Transaction("Transfer", amount, "To " + targetUserId));
            target.addTransaction(new Transaction("Received", amount, "From " + user.getUserId()));
            System.out.println("Transferred " + amount + " to " + targetUserId);
            System.out.println("Your Current Balance: " + user.getBalance());
        } else {
            System.out.println("Transfer failed. Please check details and balance.");
        }
    }
}
import java.util.ArrayList;

class ATM {
    private double balance;
    private ArrayList<String> transactionHistory;

    public ATM() {
        balance = 10000;
        transactionHistory = new ArrayList<>();
    }

    public void showHistory() {
        System.out.println("\n----- Transaction History -----");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions found!");
        } else {
            for (String s : transactionHistory) {
                System.out.println(s);
            }
        }
        System.out.println("--------------------------------\n");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            transactionHistory.add("Withdraw: ₹" + amount);
            System.out.println("Withdraw Successful!");
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }
        balance += amount;
        transactionHistory.add("Deposit: ₹" + amount);
        System.out.println("Deposit Successful!");
    }

    public void transfer(double amount, String receiver) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            transactionHistory.add("Transfer ₹" + amount + " to " + receiver);
            System.out.println("Transfer Successful to " + receiver);
        }
    }
}

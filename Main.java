import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        System.out.println("WELCOME TO ATM INTERFACE");

        System.out.print("Enter User ID: ");
        String id = sc.nextLine();

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if (!id.equals("admin") || pin != 1234) {
            System.out.println("Invalid Login!");
            return;
        }

        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.showHistory();
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    atm.withdraw(sc.nextDouble());
                    break;

                case 3:
                    System.out.print("Enter amount to deposit: ");
                    atm.deposit(sc.nextDouble());
                    break;

                case 4:
                    System.out.print("Enter amount to transfer: ");
                    double amount = sc.nextDouble();
                    sc.nextLine(); 
                    System.out.print("Enter receiver name: ");
                    String receiver = sc.nextLine();
                    atm.transfer(amount, receiver);
                    break;

                case 5:
                    System.out.println("Thank you for using ATM!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}

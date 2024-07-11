package encryptix;
import java.util.Scanner;

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void withdraw(double amount) {
        if (account.getBalance() >= amount) {
            account.withdraw(amount);
            System.out.println("Withdraw Successful. Current Balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void deposit(double amount) {
        account.deposit(amount);
        System.out.println("Successfully Deposited. Current Balance: " + account.getBalance());
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + account.getBalance());
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nATM Menu: ");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting ATM. Thank you!");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double originalBalance) {
        this.balance = originalBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

public class EncryptixTask3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        ATM atm = new ATM(account);
        atm.run();
    }
}
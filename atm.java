import java.util.Scanner;

public class atm {
    static double balance = 10000;

    static void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Please collect your money.");
        } else
            System.out.println("Insufficient Balance!");
    }

    static void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Your money has been successfully deposited: ");
    }

    static void checkBalance() {
        System.out.println("Current Account Balance: " + balance);
    }

    @SuppressWarnings("resource")
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("");
            System.out.println("");
            System.out.println("AUTOMATED TELLER MACHINE");
            System.out.println("Enter 1 to withdraw money");
            System.out.println("Enter 2 to deposit money");
            System.out.println("Enter 3 to check account balance");
            System.out.println("Enter 4 to EXIT");
            System.out.println("Enter the option you want to perform:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the amount you want to withdraw: ");
                    double amt1 = sc.nextDouble();
                    withdraw(amt1);
                    break;

                case 2:
                    System.out.println("Enter the amount you want to deposit: ");
                    double amt2 = sc.nextDouble();
                    deposit(amt2);
                    break;

                case 3:
                    checkBalance();
                    break;

                case 4:
                    System.exit(0);
            }
        }

    }
}

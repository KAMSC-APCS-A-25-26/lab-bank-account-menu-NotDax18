import java.util.Scanner;

public class BankAccountMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean menu = true;
        double accountValue = 0.00;
        while (menu) {
            System.out.println("--- Bank Account Menu ---");
        System.out.println("1. Add Money");
        System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter amount to add: ");
                double add = scan.nextDouble();
                if (0 < add) {
                    System.out.println("Added $" + add);
                    accountValue = accountValue + add;
                } else
                    System.out.println("error");

                System.out.println("New Balance: $" + accountValue);
                break;

            case 2:
                System.out.print("Enter amount to withdraw: ");
                double sub = scan.nextDouble();
                if (accountValue >= sub) {
                    accountValue = accountValue - sub;
                    System.out.println("withdrew $" + sub);
                } else
                    System.out.println("Insufficient funds");
                break;

            case 3:
                System.out.println("Current balance: $" + accountValue);
                break;

            case 4:
                menu = false;
                System.out.println("Goodbye!");
                break;
        }
        }
    }
}
import java.util.Scanner;

public class BankAccountMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean menu = true;
        double accountValue = 0.00;
        while (menu) {
            System.out.println("—- Bank Account Menu —");
        System.out.println("1. Add Money");
        System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.print("how much do you want to add?: ");
                double add = scan.nextDouble();
                if (0 <= add) {
                    System.out.println("added $" + add);
                } else
                    System.out.println("error");
                accountValue = accountValue + add;
                System.out.println("New Balance: $" + accountValue);
                break;

            case 2:
                System.out.print("How much do you want to withdraw?: ");
                double sub = scan.nextDouble();
                if (accountValue < sub) {
                    System.out.println("withdrew $” + sub");
                } else
                    System.out.println(accountValue);
                break;

            case 3:
                System.out.println("Your balance is: $" + accountValue);
                break;

            case 4:
                menu = false;
                System.out.println("Goodbye!");
                break;
        }
        }
    }
}
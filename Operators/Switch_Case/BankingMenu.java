import java.util.Scanner;

class BankingMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 5000;

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter deposit amount: ");
                int deposit = sc.nextInt();

                balance = balance + deposit;

                System.out.println("Amount Deposited = ₹" + deposit);
                System.out.println("Your Balance = ₹" + balance);
                break;

            case 2:
                System.out.print("Enter withdrawal amount: ");
                int withdraw = sc.nextInt();

                if (withdraw <= balance) {
                    balance = balance - withdraw;

                    System.out.println("Amount Withdrawn = ₹" + withdraw);
                    System.out.println("Your Balance = ₹" + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;

            case 3:
                System.out.println("Your Balance = ₹" + balance);
                break;

            case 4:
                System.out.println("Thank You");
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
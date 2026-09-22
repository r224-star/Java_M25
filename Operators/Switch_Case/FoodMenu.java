import java.util.Scanner;

class FoodMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Dosa");
        System.out.println("4. Biryani");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Pizza = ₹200");
                break;

            case 2:
                System.out.println("Burger = ₹100");
                break;

            case 3:
                System.out.println("Dosa = ₹80");
                break;

            case 4:
                System.out.println("Biryani = ₹180");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
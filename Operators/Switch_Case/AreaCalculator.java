import java.util.Scanner;

class AreaCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();

                System.out.println("Area of Circle = " + (3.14 * r * r));
                break;

            case 2:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();

                System.out.print("Enter breadth: ");
                double b = sc.nextDouble();

                System.out.println("Area of Rectangle = " + (l * b));
                break;

            case 3:
                System.out.print("Enter side: ");
                double s = sc.nextDouble();

                System.out.println("Area of Square = " + (s * s));
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
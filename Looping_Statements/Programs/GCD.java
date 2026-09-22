import java.util.Scanner;

class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome GCD Calculator!");

        System.out.println("Enter Your First Number!");
        int a = input.nextInt();

        System.out.println("Enter Your Second Number!");
        int b = input.nextInt();

        System.out.println("Enter Your Third Number!");
        int c = input.nextInt();

        int gcd;

        if (a <= b && a <= c) {
            gcd = a;
        } else if (b <= a && b <= c) {
            gcd = b;
        } else {
            gcd = c;
        }

        while (gcd >= 1) {
            if (a % gcd == 0 && b % gcd == 0 && c % gcd == 0) {
                break;
            }
            gcd--;
        }

        System.out.println("Your GCD is: " + gcd);
    }
}
import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome LCM Calculator!");

        System.out.println("Enter Your First Number!");
        int a = input.nextInt();

        System.out.println("Enter Your Second Number!");
        int b = input.nextInt();

        System.out.println("Enter Your Third Number!");
        int c = input.nextInt();

        int lcm;

        if (a >= b && a >= c) {
            lcm = a;
        } else if (b >= a && b >= c) {
            lcm = b;
        } else {
            lcm = c;
        }

        while (true) {
            if (lcm % a == 0 && lcm % b == 0 && lcm % c == 0) {
                break;
            }
            lcm++;
        }

        System.out.println("Your LCM is: " + lcm);
    }
}
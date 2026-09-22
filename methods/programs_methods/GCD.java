import java.util.Scanner;

class GCD {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To Greatest Common Divisor!");
        System.out.println("Please Enter Your First Number!");
        int num1 = input.nextInt();

        System.out.println("Please Enter Your Second Number!");
        int num2 = input.nextInt();

        int gcd = isGCD(num1, num2);

        System.out.println("Your Greatest Common Divisor is: " + gcd);

        input.close();
    }

    public static int isGCD(int num1, int num2) {

        int small;

        if (num1 < num2) {
            small = num1;
        } else {
            small = num2;
        }

        while (small > 0) {

            if (num1 % small == 0 && num2 % small == 0) {
                return small;
            }

            small--;
        }

        return 0;
    }
}
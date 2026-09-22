import java.util.Scanner;

class SmallestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Positive Negative Zero!");

        System.out.println("Enter Your First Number!");
        int num1 = input.nextInt();

        System.out.println("Enter Your Second Number!");
        int num2 = input.nextInt();

        System.out.println("Enter Your Third Number!");
        int num3 = input.nextInt();

        int small = isGreater(num1, num2, num3);
        System.out.println(small + " is Smallest of three");
    }

    public static int isGreater(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }
}
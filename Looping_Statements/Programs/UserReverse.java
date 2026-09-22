import java.util.Scanner;

class UserReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To User Reverse");
        System.out.println("Enter Your Number!");

        int num = input.nextInt();
        int reverse = 0;

        for (; num > 0; num = num / 10) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
        }

        System.out.println("User Reverse : " + reverse);
    }
}
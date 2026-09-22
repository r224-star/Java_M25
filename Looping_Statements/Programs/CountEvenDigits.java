import java.util.Scanner;

class CountEvenDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To Count The Even Digits!");
        System.out.println("Enter your Number!");

        int num = input.nextInt();
        int count = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                count++;
            }

            num = num / 10;
        }

        System.out.println("Count of Even Digits: " + count);
    }
}
import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int original = num;
        int count = 0;
        int sum = 0;

        // Count digits
        int temp = num;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        // Calculate Armstrong sum
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;

            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        // Check Armstrong
        if (sum == original) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is not an Armstrong Number");
        }
    }
}
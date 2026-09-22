import java.util.Scanner;

class SumOfEvenDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To Sum Of Even Numbers!");
        System.out.println("Please Enter Your Number");

        int num = input.nextInt();
        int i;
        int sum = 0;

        for (i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }

        System.out.println("Sum is: " + sum);
    }
}
import java.util.Scanner;

class FactorsSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To Factors Sum!");
        System.out.println("Please Enter Your Number!");

        int num = input.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= num) {
            if (num % i == 0) {
                sum = sum + i;
            }
            i++;
        }

        System.out.println("Your Sum of Factors is: " + sum);
    }
}
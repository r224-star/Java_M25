import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To Fibonacci Series!");
        System.out.println("Please Enter Your Number!");

        int num = input.nextInt();

        int n1 = 0, n2 = 1;

        isFibonacci(num, n1, n2);
    }

    public static void isFibonacci(int num, int n1, int n2) {
        int i = 0;

        while (i <= num) {
            System.out.println(n1);

            int temp = n1 + n2;
            n1 = n2;
            n2 = temp;

            i++;
        }
    }
}
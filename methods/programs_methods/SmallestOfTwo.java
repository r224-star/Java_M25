import java.util.Scanner;

class SmallestOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Positive Negative Zero!");

        System.out.println("Enter Your First Number!");
        int num1 = input.nextInt();

        System.out.println("Enter Your Second Number!");
        int num2 = input.nextInt();


        int small = isGreater(num1, num2);
        System.out.println(small + " is Smallest of Two");
    }

    public static int isGreater(int a, int b) {
        if (a <= b) {
            return a;
        } else {
            return b;
       }
   }
}
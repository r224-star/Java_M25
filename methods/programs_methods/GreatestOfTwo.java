import java.util.Scanner;

class GreatestOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Positive Negative Zero!");

        System.out.println("Enter Your First Number!");
        int num1 = input.nextInt();

        System.out.println("Enter Your Second Number!");
        int num2 = input.nextInt();

       
        int greater = isGreater(num1, num2);
        System.out.println(greater + " is greater");
    }

    public static int isGreater(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }      
    }
}
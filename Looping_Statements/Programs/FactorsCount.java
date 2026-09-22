import java.util.Scanner;

class 
 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Factorial Calculator!");
        System.out.println("Enter Your Number!");

        int num = input.nextInt();

        int i = 1;
        int fact = 1;

        while (i <= num) {
            fact = fact * i;
            System.out.println("Number included: " + i);
            System.out.println("Factorial so far: " + fact);
            i++;
        }

        System.out.println("Final Factorial = " + fact);
        System.out.println("Counted numbers = " + i);
    }
}
import java.util.Scanner;

class ReverseTheDigits{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Reverse The Digits In Java!");
    System.out.println("Please Enter Your Number!");
    int num = input.nextInt();
    int reverse = isReverse(num);
    System.out.println("Your Number is Reverse:"+reverse);

    
  }
  public static int isReverse(int num) {
    int reverse = 0;

    while (num > 0) {
        int digit = num % 10;
        reverse = reverse * 10 + digit;
        num = num / 10;
    }
    return reverse;
  }
}
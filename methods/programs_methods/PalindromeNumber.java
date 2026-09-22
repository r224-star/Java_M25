import java.util.Scanner;

class PalindromeNumber{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Check The Palindrome Number!");
    System.out.println("Please Enter Your Number!");
    int num = input.nextInt();
    boolean palindrome = isPalindrome(num);
    if(palindrome){
      System.out.println(num+"Your Number is Palindrome Number!");
    }else{
      System.out.println(num+"Your Number is Not Palindrome Number!");
    }
  }
  public static boolean isPalindrome(int num) {
    int original = num;
    int reverse = 0;

    while (num > 0) {
        int digit = num % 10;
        reverse = reverse * 10 + digit;
        num = num / 10;
    }

    return original == reverse;
  }
}
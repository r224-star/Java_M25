import java.util.Scanner;

class Square{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Addition Of Two Numbers!");
    System.out.println("Enter Your First Number!");
    int num1 = input.nextInt();
   // System.out.println("Enter Your Second Number!");
   // int num2 = input.nextInt();
    int square = isSum(num1);
    System.out.println("Your Multiply is"+square);
  
  }
  public static int isSum(int a){
    return a*a;
  }
}
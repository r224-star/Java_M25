import java.util.Scanner;

class Divide{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Addition Of Two Numbers!");
    System.out.println("Enter Your First Number!");
    int num1 = input.nextInt();
    System.out.println("Enter Your Second Number!");
    int num2 = input.nextInt();
    int div = isSum(num1,num2);
    System.out.println("Your Multiply is"+div);
  
  }
  public static int isSum(int a,int b){
    return a/b;
  }
}
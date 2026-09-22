import java.util.Scanner;

class Add{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Addition Of Two Numbers!");
    System.out.println("Enter Your First Number!");
    int num1 = input.nextInt();
    System.out.println("Enter Your Second Number!");
    int num2 = input.nextInt();
    int sum = isSum(num1,num2);
    System.out.println("Your Sums is"+sum);
  
  }
  public static int isSum(int a,int b){
    return a+b;
  }
}
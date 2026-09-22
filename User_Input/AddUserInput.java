import java.util.Scanner;

class AddUserInput{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To User Input in Java!");
    System.out.println("Enter Your Integer Number!");
    int a = input.nextInt();
    System.out.println("Enter Your Second Number!");
    int b = input.nextInt();
    int c = a+b;
    System.out.println("Your Sum is :"+c);
  }
}
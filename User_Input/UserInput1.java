import java.util.Scanner;

class UserInput1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To User Input in Java!");
    System.out.println("Enter Your Integer Number!");
    int num = input.nextInt();
    System.out.println(num);
  }
}
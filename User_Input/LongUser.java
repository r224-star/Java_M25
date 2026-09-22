import java.util.Scanner;

class LongUser{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To User Input in Java!");
    System.out.println("Enter Your Integer Number!");
    long a = input.nextLong();
    System.out.println("Enter Your Second Number!");
    long b = input.nextLong();
    long c = a+b;
    System.out.println("Your Sum is :"+c);
  }
}
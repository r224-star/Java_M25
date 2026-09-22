import java.util.Scanner;

class TriangleCheck{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Angle is Triangle or Not!");
    System.out.println("Enter Your Side");
    int a = input.nextInt();
    System.out.println("Enter Your Side!");
    int b = input.nextInt();
    System.out.println("Enter Your Side!");
    int c = input.nextInt();

    if(a+b>c && b+c>c && c+a>a){
      System.out.println("Your triangle Is Valid");
    }else{
      System.out.println("Your Triangle Is Not Valid!");
    }
  }
}
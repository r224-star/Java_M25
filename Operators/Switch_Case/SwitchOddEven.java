import java.util.Scanner;

class SwitchOddEven{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Switch Case Odd Even!");
    System.out.println("Enter Your Number!");
    int num = input.nextInt();
    switch(num%2){
      case 1:
        System.out.println("Even Number!");
        break;
      case 2:
        System.out.println("Odd Number");
        break;
      default:
        System.out.println("Other Number");
        break;
    }
    
  }
}
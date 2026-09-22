import java.util.Scanner;

class Calculator1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Switch Case Calculator!");
    System.out.println("Please Enter Your First Number!");
    int a = input.nextInt();
    System.out.println("Please Enter Your Second Number!");
    int b = input.nextInt();
    System.out.println("Addition");
    System.out.println("Subtraction");
    System.out.println("Multiplication");
    System.out.println("Division");
    System.out.println("Modulas");
    int choice = input.nextInt();

    switch(choice){
      case 1:
        System.out.println("Addition of :"+(a+b));
        break;
      case 2:
        System.out.println("Subtraction of :"+(a-b));
        break;
      case 3:
        System.out.println("Multiplication of :"+(a*b));
        break;
      case 4:
        System.out.println("Division of :"+(a/b));
        break;
      case 5:
        System.out.println("Modulas of :"+(a%b));
        break;
      default:
        System.out.println("Invalid Operator!");
 
    }
    
  }
}
import java.util.Scanner;

class Calculator{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Switch Case Calculator!");
    System.out.println("Please Enter Your First Number!");
    int a = input.nextInt();
    System.out.println("Please Enter Your Second Number!");
    int b = input.nextInt();
    char operator = input.next().charAt(0);
    System.out.println("");
    switch(operator){
      case '+':
        System.out.println("Addition of :"+(a+b));
        break;
      case '-':
        System.out.println("Subtraction of :"+(a-b));
        break;
      case '*':
        System.out.println("Multiplication of :"+(a*b));
        break;
      case '/':
        System.out.println("Division of :"+(a/b));
        break;
      case '%':
        System.out.println("Modulas of :"+(a%b));
        break;
      default:
        System.out.println("Invalid Operator!");
 
    }
    
  }
}
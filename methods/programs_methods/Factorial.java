import java.util.Scanner;

class Factorial{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Factorial Calculator!");
    System.out.println("Please Enter Your Number!");
    int num = input.nextInt();
    int factorial = isFactorial(num);
    System.out.println("Factorial is : "+factorial);
    
  }
  public static int isFactorial(int num){
    int i=1,fact=1;
    while(i<=num){
      fact=fact*i;
      i++;
    }
    return fact;
  }
}
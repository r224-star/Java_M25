
import java.util.Scanner;

class Factorial1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Factorial number!");
    System.out.println("Please Enter Your number!");
    int num = input.nextInt();  
    int fact = 1;
    int i = 1;
    while(i<=num){
      fact = fact*i; 
      i++;
    }
    System.out.println("Factorial is :"+fact);
  }
}
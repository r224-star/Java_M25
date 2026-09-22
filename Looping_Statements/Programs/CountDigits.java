import java.util.Scanner;

class CountDigits{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Counts The Digits!");
    System.out.println("Enter your Number!");
    int num = input.nextInt();
    int i = 1;
    while(i<=num){
      i++;
    }
    System.out.println("Count is :"+i);
    
  }
}
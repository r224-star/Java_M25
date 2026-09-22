import java.util.Scanner;

class PrimeNumber1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Prime Number Checker!");
    System.out.println("Please Enter Your Number!");
    int num = input.nextInt();
    int count = 0;
    int i=1;
    while(i<=num){
      if(num%i==0){
        count++;
      }
      i++;
    }
    if(count==2){
      System.out.println("Prime Number!");
    }else{
      System.out.println("Not Prime Number!");
    }
  }
}
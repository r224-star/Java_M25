import java.util.Scanner;

class PrimeNumber4{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Prime Number Checker!");
    System.out.println("Please Enter Your Number!");
    int num = input.nextInt();
    PrimeNumber2 p1 = new PrimeNumber2();
    p1.isPrime(num);
  }
  void isPrime(int num){
    int count = 0;
    int i;
    for(i=1;i<=num/1;i++){
      if(num%i==0){
        count++;
      }
      
    }
    if(count==1){
      System.out.println("Prime Number!");
    }else{
      System.out.println("Not Prime Number!");
    }
  }
}
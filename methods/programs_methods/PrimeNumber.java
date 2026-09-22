import java.util.Scanner;

class PrimeNumber{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Prime Number Checker!");
    System.out.println("Enter Your Number!");
    int num = input.nextInt();
    boolean prime = isPrime(num);
    if(prime){
      System.out.println(num+"Prime Number!");
    }else{
      System.out.println(num+"Not Prime Number!");
    }
    int i=1;
    while(i<=num){
      if(isPrime(i)){
        System.out.println("Prime Numbers :"+i);
      }
      i++;
    }
  }
  public static boolean isPrime(int num){
    if(num<2){
      return false;
    }
    int i=2;
    while(i<=num/2){
      if(num%i==0){
        return false;
      }
      i++;
    }
    return true;
  }
}
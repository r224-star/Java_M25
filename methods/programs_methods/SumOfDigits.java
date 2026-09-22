import java.util.Scanner;

class SumOfDigits{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Check Sum Of Digits!");
    System.out.println("Please Enter Your Number!");
    int num = input.nextInt();
    int sum = isSum(num);
    System.out.println("Count The Digits :"+sum);
    

  }
 public static int isSum(int num) {
    int sum = 0;

    while (num > 0) {
        int digit = num % 10;
        sum=sum+digit;
        num = num / 10;
    }

    return sum;
}
}
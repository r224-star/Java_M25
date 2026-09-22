import java.util.Scanner;

class SumOfDigits{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Count Digit Greater or Equals To 5!");
    System.out.println("Please Enter Your Number");
    int num = input.nextInt();
    int i,sum=0;
    for(i=0;i<=num;i++){
      sum=sum+i;
    }
    System.out.println("Sum is:"+sum); 
  }
}
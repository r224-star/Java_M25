import java.util.Scanner;

class NumberDivisible{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Number Divisible By 5 And 11 or Not!");
    System.out.println("Enter Your Number!");
    int num = input.nextInt();
    if(num%5==0 || num%11==0){
      System.out.println(num +"Your Number is Divisible!");
    }else{
      System.out.println(num +"Your Number is Not Divisible!");
    }
  }
}
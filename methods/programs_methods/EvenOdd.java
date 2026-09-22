import java.util.Scanner;

class EvenOdd{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Addition Of Two Numbers!");
    System.out.println("Enter Your First Number!");
    int num = input.nextInt();
    boolean even = isEvenOdd(num);
    if(even){
      System.out.println("Even Number");
    }else{
      System.out.println("Odd Number");
    }
  
  }
  public static boolean isEvenOdd(int a){
    if(a%2==0){
      return true;
    }else{
      return false;
    }
   
  }
}
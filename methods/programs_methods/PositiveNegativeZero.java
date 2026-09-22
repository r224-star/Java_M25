import java.util.Scanner;

class PositiveNegativeZero{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Positive Negative Zero!");
    System.out.println("Please Enter Your Number!");
    int num = input.nextInt();
    isPNZ(num);
  


  } 
  public static void isPNZ(int num){
    if(num>1){
      System.out.println("Positive number");
    }else if(num==0){
      System.out.println("Zero Number");
    }else{
      System.out.println("Negative Number");
    }
  }
}
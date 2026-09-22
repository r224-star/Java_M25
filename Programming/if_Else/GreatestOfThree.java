import java.util.Scanner;
class GreatestOfThree{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Greatest Of Three Numbers!");  
    System.out.println("Please Enter Your First Number!");
    int num1 = input.nextInt();
    System.out.println("Please Enter Your Second Number!");
    int num2 = input.nextInt();
    System.out.println("Please Enter Your Third Number!");
    int num3 = input.nextInt();
    if(num1>num2 && num2>num3){
      System.out.println(num1 +" Num1 Is The Biggest number! ");
    }else if(num2>num3){
      System.out.println(num2 +" Num2 Is The Biggest Number!");
    }else{
      System.out.println(num3 +" Num3 Is The Biggest Numbers!");           
    }
  }
}
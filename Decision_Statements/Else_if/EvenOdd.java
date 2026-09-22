import java.util.Scanner;

class EvenOdd{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Odd Even Calculator!");
    int num = input.nextInt();
    if(num%2==0){
      System.out.println(num+"Even Number");
    }else{
      System.out.println(num+"Odd Nujmber");
    }
  }
}
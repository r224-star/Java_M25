import java.util.Scanner;

class PrintEven{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Even Print!");
    System.out.println("Enter Your Number!");
    int b = input.nextInt();
    int a=1;
    while(a<=b){
      if(a%2==0){
        System.out.println(a);
      }
      a++;
   }
  }
}
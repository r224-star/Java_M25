import java.util.Scanner;

class ProductDigits{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Product Of Digits!");
    System.out.println("Please Enter Your Number!!");
    int num = input.nextInt();
    int product = isProduct(num);
    System.out.println("Product Of Digits :"+product);
   
    
  }
  public static int isProduct(int num){
    int product = 1;
    while(num>0){
      int digit = num%10;
      product = product*digit;
      num=num/10;
    }
    return product;
  }
}
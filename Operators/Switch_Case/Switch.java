import java.util.Scanner;

class Switch{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Switch case Operator!");
    System.out.println("Please Enter Your Number!!");
    int num = input.nextInt();
    switch(num){
      case 1:
      {
        System.out.println("Case 1 Executed!");
      }
      case 2:
      {
        System.out.println("Case 1 Executed!");
      }
      case 3:
      {
        System.out.println("Case 1 Executed!");
      }
      case 4:
      {
        System.out.println("Case 1 Executed!");
      }
      case 5: 
      {
        System.out.println("Case 1 Executed!");
      }
      default:
        System.out.println("Not Executed!");
    }
   }
  
}
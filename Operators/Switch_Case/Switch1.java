import java.util.Scanner;

class Switch1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Switch case Operator!");
    System.out.println("Please Enter Your Number!!");
    int num = input.nextInt();
    switch(num){
      case 1:
      {
        System.out.println("Case 1 Executed!");
        break;
      }
      case 2:
      {
        System.out.println("Case 2 Executed!");
        break;
      }
      case 3:
      {
        System.out.println("Case 3 Executed!");
        break;
      }
      case 4:
      {
        System.out.println("Case 4 Executed!");
        break;
      }
      case 5: 
      {
        System.out.println("Case 5 Executed!");
        break;
      }
      default:
        System.out.println("Not Executed!");
        break;
    }
   }
  
}
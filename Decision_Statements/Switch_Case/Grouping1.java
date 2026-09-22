import java.util.Scanner;

class Grouping1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Grouping Characters!");
    int dice = input.nextInt();
    switch(dice){
      case 1:
        System.out.println("Dance");
        break;
      case 2,4,6:
        System.out.println("Sing");
        break;
      case 3:
        System.out.println("Dance");
        break;
      case 5:
        System.out.println("Sing");
        break;
      default:
        System.out.println("No Case Matched!");   
        break;
    }
  }
}
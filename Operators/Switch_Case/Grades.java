import java.util.Scanner;
 
class Grades{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Check Vowel Or Not");
    System.out.println("Enter Your Charater!");
    char ch = input.next().charAt(0);
    
    switch(ch){
      case 'A':
        System.out.println("Excelent");
        break;
      case 'B':
        System.out.println("Very Good");
        break;
      case 'C':
        System.out.println("Good");
        break;
      case 'D':
        System.out.println("Average");
        break;
      case 'E':
        System.out.println("Fail");
        break;
      default:
        System.out.println("Fail You Better Luck Next Time");
    }
  }
}
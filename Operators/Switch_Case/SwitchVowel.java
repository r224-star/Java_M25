import java.util.Scanner;
 
class SwitchVowel{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Check Vowel Or Not");
    System.out.println("Enter Your Charater!");
    char ch = input.next().charAt(0);
    
    switch(ch){
      case 'a':
        System.out.println("Vowel");
        break;
      case 'e':
        System.out.println("Vowel");
        break;
      case 'i':
        System.out.println("Vowel");
        break;
      case 'o':
        System.out.println("Vowel");
        break;
      case 'u':
        System.out.println("Vowel");
        break;
      default:
        System.out.println("Other Character");
    }
  }
}
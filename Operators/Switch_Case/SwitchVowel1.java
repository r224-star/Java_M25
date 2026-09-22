import java.util.Scanner;
 
class SwitchVowel1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Check Vowel Or Not");
    System.out.println("Enter Your Charater!");
    char ch = input.next().charAt(0);
    
    switch(ch){
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
        System.out.println("Vowel");
        break;
      case '0':
      case '1':
      case '2':
      case '3':
      case '4':
      case '5':
      case '6':
      case '7':
      case '8':
      case '9':
        System.out.println("Number");
        break;
      default:
        System.out.println("Consonant");
    }
  }
}
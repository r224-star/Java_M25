import java.util.Scanner;
 
class VowelConsonant{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Vowel Consonant Checker!");
    char ch = input.next().charAt(0);
    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){ 
      System.out.println(ch +"Your Character Is Vowel!");
    }else{
      System.out.println(ch+"Your Character Is Consonant!");
    }
  }
}
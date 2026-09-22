import java.util.Scanner;

class UpperCaseLoweCase{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);  
    System.out.println("Welcome To Find The Character!");
    System.out.println("Enter Your Character");
    char ch = input.next().charAt(0);
    if(ch>='a' && ch<='z'){
      System.out.println(ch +"Your Character Is Lowercase!");
    }else if(ch>='A' && ch<='Z'){
      System.out.println(ch +"Your character Is Uppercase!");
    }else{
      System.out.println(ch+"Your Character is Other Character!");
    }
  }
}
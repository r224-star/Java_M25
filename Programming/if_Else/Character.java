import java.util.Scanner;

class Character{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Check Lower Case And Upper case Alphabet");
    System.out.println("Please Enter Your Character!");  
    char ch = input.next().charAt(0);
    if(ch>='a' && ch<='z'){
      System.out.println(ch +"Character is Lowercase");
    }else if(ch>='A' && ch<='Z'){
      System.out.println(ch +"Character Is Upper case");
    }else{
      System.out.println(ch+"Character is Other !");
    }
  }
}
import java.util.Scanner;

class FindCharacter{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);  
    System.out.println("Welcome To Find The Character!");
    System.out.println("Enter Your Character");
    char ch = input.next().charAt(0);
    if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
      System.out.println(ch +"Your Character is Alphabet!");
    }else if(ch>='0' && ch<='9'){
      System.out.println(ch +"Your Character Is Number!");
    }else{
      System.out.println(ch+"Your Character is Special Character!");
    }
  }
}
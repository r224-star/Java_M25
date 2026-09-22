import java.util.Scanner;

class CountDigits{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Check Count The Digits!");
    System.out.println("Please Enter Your Number!");
    int num = input.nextInt();
    int count = isCount(num);
    System.out.println("Count The Digits :"+count);
    

  }
 public static int isCount(int num) {
    int count = 0;

    while (num > 0) {
        int digit = num % 10;
        count++;
        num = num / 10;
    }

    return count;
}
}
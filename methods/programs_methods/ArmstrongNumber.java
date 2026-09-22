import java.util.Scanner;

class ArmstrongNumber{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Armstrong Number!");
    System.out.println("Please Enter Your Number!");
    int num = input.nextInt();
    boolean armstrong = isArmstrong(num);
    if(armstrong){
      System.out.println(num+"Armstrong Number!");
    }else{
      System.out.println(num+"Not Armstrong Number!");
    }
    
  }
 public static boolean isArmstrong(int num) {
    int count = isCount(num);
    int original = num;
    int sum = 0;

    while (num > 0) {
        int digit = num % 10;

        int power = 1;
        int i = 1;

        while (i <= count) {
            power = power * digit;
            i++;
        }

        sum = sum + power;
        num = num / 10;
    }

    return original == sum;
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
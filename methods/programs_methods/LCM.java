import java.util.Scanner;

class LCM{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To least Common Multiple!");
    System.out.println("Please Enter Your First Number!");
    int num1 = input.nextInt();

    System.out.println("Please Enter Your Second Number!");
    int num2 = input.nextInt();
    int lcm = isLCM(num1,num2);
    System.out.println("Your LCM is :"+lcm);

  }
  public static int isLCM(int a,int b){
    int big;
    if(a>b){
      big=a;
    }else{
      big=b;
    }
    while(big>0){
      if(big%a==0 && big%b==0){
        break;
      }
      big++;
    }
    return big;
  }
}
import java.util.Scanner;
class LeapYear{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Leap Year Calculator!");
    System.out.println("Enter Your Leap Year!");
    int year = input.nextInt();
    if(year%4==0){
      System.out.println(year+"Your Year Is Leap Year");
    }else if(year%100==0){  
      System.out.println(year+"Your Year Is Leap Year");
    }else{
      System.out.println(year+"Your Year Is Not A Leap Year");
   }
  }
}
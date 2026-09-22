import java.util.Scanner;

class SumOfCubes{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To Sum Of Natural Number Sum Of Cubes!!");
    System.out.println("Enter Your Number!");
    int num = input.nextInt();
    int i = 0,sum=0; 
    while(i<=num){
      sum = sum+i*i*i;
      i++;
    }
    System.out.println("Your Sum is :"+sum);
    
  }
}
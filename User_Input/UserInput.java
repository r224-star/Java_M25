import java.util.Scanner;

class UserInput{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome To User Input In Java!");
    System.out.println("Please Enter Your Name!");
    String name = input.next();
    System.out.println(name);
    System.out.println("Enter Your Age!");
    int age = input.nextInt();
    System.out.println(age);
    System.out.println("Enter Your Gender!");
    String gender = input.next();
    System.out.println(gender);
    System.out.println("Enter Your Salary!");
    double sal = input.nextDouble();
    System.out.println(sal);
    System.out.println("Please Enter Your Contact Number!");
    float contact = input.nextFloat();
    System.out.println(contact);
    System.out.println("Completed!");
    
    
    
    
    
    
  }
}
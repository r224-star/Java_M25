import java.util.Scanner;
 
class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number:");
        int num = input.nextInt();

        int i = 2;

        while (i <= num / 2) {
            if (num % i == 0) {
                System.out.println("Not Prime Number");
                return;
            }
            i++;
        }

        System.out.println("Prime Number");
       /* for(int j=1;j<=num;j++){
          if(num(i)){
            System.out.println(i);  
          }
          j++;
        }
       */
    }
}
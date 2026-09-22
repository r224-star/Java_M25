class SumOfOdd {
    public static void main(String[] args) {
        int a;
        int b = 15;
        int sum = 0;

        for (a = 5; a <= b; a++) {
            if (a % 2 != 0) {
                sum = sum + a;
            }
        }

        System.out.println("Sum of Odd Numbers: " + sum);
    }
}
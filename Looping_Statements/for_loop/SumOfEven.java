class SumOfEven {
    public static void main(String[] args) {
        int a;
        int b = 25;
        int sum = 0;

        for (a = 15; a <= b; a++) {
            if (a % 2 == 0) {
                sum = sum + a;
            }
        }

        System.out.println("Sum of Even Numbers: " + sum);
    }
}
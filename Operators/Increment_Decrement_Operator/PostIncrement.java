class PostIncrement {
    public static void main(String[] args) {

        int a = 15;

        int b = a++ + a++ - a++ + a++ + a++ - a++;

        System.out.println(a);
        System.out.println(b);
    }
}
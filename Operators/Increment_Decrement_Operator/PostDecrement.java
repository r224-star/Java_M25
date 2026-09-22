class PostDecrement {
    public static void main(String[] args) {

        int a = 40;

        int b = a-- + a-- - a-- + a-- - a-- + a--;

        System.out.println(a);
        System.out.println(b);
    }
}
class LogicalOperator3 {
    public static void main(String[] args) {
        int a = 9;
        int b = 8;
        int c = 7;
        int d = 3;

        boolean e = !((c-- > ++d || a++ > --b) && b++ > --c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
class NaroWido {
    public static void main(String[] args) {

        System.out.println("Welcome to Widening Typecast!");

        byte a = 75;
        short b = a;
        System.out.println(b);

        System.out.println("============");

        short c = 75;
        // byte d = c;              // ❌ Error: Narrowing
        byte d = (byte) c;          // ✅ Explicit casting
        System.out.println(d);

        System.out.println("============");

        char e = 75;
        int f = e;
        System.out.println(f);

        System.out.println("============");

        int g = 75;
        long h = g;
        System.out.println(h);

        System.out.println("============");

        long i = 75;
        float j = i;
        System.out.println(j);

        System.out.println("============");

        double k = 75;
        // int l = k;               // ❌ Error: Narrowing
        int l = (int) k;            // ✅ Explicit casting
        System.out.println(l);

        System.out.println("============");


        System.out.println("Welcome To Narrowing Type Casting!");

        double m = 75;
        float n = (float) m;
        System.out.println(n);

        System.out.println("============");

        float o = 75;
        long p = (long) o;
        System.out.println(p);

        System.out.println("============");

        long q = 75;
        int r = (int) q;
        System.out.println(r);

        System.out.println("============");

        int s = 75;
        char t = (char) s;
        System.out.println(t);

        System.out.println("============");

        char u = 75;
        short v = (short) u;
        System.out.println(v);

        System.out.println("============");

        short w = 75;
        byte x = (byte) w;
        System.out.println(x);

        System.out.println("============");
    }
}
//byte<short>char<int<long<float<double
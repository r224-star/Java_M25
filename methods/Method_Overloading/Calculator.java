package Method_Overloading;

public class Calculator{
	public static void add(int a, int b) {
		System.out.println("int, int arg add method");
		System.out.println("Sum is: "+(a+b));
	}
	public static void add(int a, double b) {
		System.out.println("int, double arg add method");
		System.out.println("Sum is: "+(a+b));
	}
	public static void add(double a, int b) {
		System.out.println("double, int arg add method");
		System.out.println("Sum is: "+(a+b));
	}
	public static void add(double a, double b) {
		System.out.println("double, double arg add method");
		System.out.println("Sum is: "+(a+b));
	}
	public static void add(int a, int b, int c) {
		System.out.println("int, int, int arg add method");
		System.out.println("Sum is: "+(a+b+c));
	}
	public static void add(int a, int b, double c) {
		System.out.println("int, int, double arg add method");
		System.out.println("Sum is: "+(a+b+c));
	}
	public static void add(int a, double b, int c) {
		System.out.println("int, double, int arg add method");
		System.out.println("Sum is: "+(a+b+c));
	}
	public static void add(double a, int b, int c) {
		System.out.println("double, int, int arg add method");
		System.out.println("Sum is: "+(a+b+c));
	}
	public static void add(int a, double b, double c) {
		System.out.println("int, double, double arg add method");
		System.out.println("Sum is: "+(a+b+c));
	}
	public static void add(double a, double b, int c) {
		System.out.println("double, double, int arg add method");
		System.out.println("Sum is: "+(a+b+c));
	}
	public static void add(double a, double b, double c) {
		System.out.println("double, double, double arg add method");
		System.out.println("Sum is: "+(a+b+c));
	}

}









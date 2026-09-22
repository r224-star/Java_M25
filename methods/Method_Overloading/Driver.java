package Method_Overloading;
public class Driver {
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println(23+40);
		System.out.println(40+12.6);
		System.out.println('@');
		int a=12;	double b=24.2; int m=34;	int n=45;
		Calculator.add(a, b);
		System.out.println("===================");
		int x=20;	double y=24.1;	int z=40;
		Calculator.add(x, y, z);
		System.out.println("=====================");
		int p=34;	double q=44.5;		double r=30.3;
		Calculator.add(p,  q, r);
		System.out.println("=======================");
		double i=23.2;		double j=28.1;		int k=33;
		Calculator.add(i,  j, k);
	}

}

class LogicalOperator2{
  public static void main(String[] args){
    int a = 2;
    int b = 3;
    int c = 1;
    boolean d = (c++<++b && ++a>c--) || c++<b++;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
  }
}
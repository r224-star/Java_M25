class GreatestOfThree{
  public static void main(String[] args){
    int a = 15;
    int b = 19;
    int c = 17;
    if(a>b && b>c){
      System.out.println(a+" A is Greatest Number");
    }else if(b>c && c>a){
      System.out.println(b+" B is Greatest Number");
    }else if(c>b && c>a){
      System.out.println(c+" C is Greatest Number");
    }  
  }
}
class PrintDivisibleBySevenCount{
  public static void main(String[] args){
    int a=1;
    while(a<=200){
      if(a%7==0 || a%10==7){
        System.out.println("Divisible By 7 :"+a);
      }
      a++;
    }
    System.out.println(a+"Counted");
  }
}
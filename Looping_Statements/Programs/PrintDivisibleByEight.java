class PrintDivisibleByEight{
  public static void main(String[] args){
    int a=1;
    while(a<=200){
      if(a%8==0){
        System.out.println("Divisible By 8 :"+a);
      }
      a++;
    }
  }
}
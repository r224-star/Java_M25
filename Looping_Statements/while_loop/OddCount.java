class OddCount{
  public static void main(String[] args){
    int a = 1;
    int b = 20;
    int count=0;
    while(a<=b){
      if(a%2!=0){
        count++;
      }
      a++;
    }
    System.out.println(count);
  }
}
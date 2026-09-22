class AlphabetNumber{
  public static void main(String[] args){
    char ch = '3';
    if(ch=='A' && ch=='Z' || ch=='a' && ch=='z'){
      System.out.println(ch+" is Alphabet");
    }else{
       System.out.println(ch+" is Number");
    }
  }
}
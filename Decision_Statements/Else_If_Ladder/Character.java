class Character{  
  public static void main(String[] args){  
    char ch = '@';
    if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
      System.out.println(ch+" is Alphabet");
    }else if(ch>='0' && ch<='9'){
      System.out.println(ch+" is Number");
   }else{
      System.out.println(ch+" is Special Character");
   }      
 }
}
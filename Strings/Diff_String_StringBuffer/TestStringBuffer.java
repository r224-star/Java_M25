class TestStringBuffer{
  public static void main(String[] args){
    StringBuffer s1 = new StringBuffer("Durga");
    StringBuffer s2 = new StringBuffer("Durga");
    System.out.println(s1==s2);
    System.out.println(s1.equals(s2));

  }
}
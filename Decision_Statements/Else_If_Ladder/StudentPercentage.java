class StudentPercentage{
  public static void main(String[] args){
    int per = 68;
    if(per>85){
      System.out.println(per+"You Have Got First Division");
    }else if(per>70){
      System.out.println(per+"You Have Got Second Division");
    }else if(per>55){
      System.out.println(per+"You Have Got Third Division");
    }else if(per>40){
      System.out.println(per+"You Have Got Fourth Division");
    }else{
      System.out.println(per+"You Have Failed Better Luck Next Time");
    }
  }
}
package constructor_overloading;

class StudentDriver{
  public static void main(String[] args){
    Student s1 = new Student(101,"Aditya","male",25000000);
    System.out.println(s1.id);
    System.out.println(s1.name);
    System.out.println(s1.gender);
    System.out.println(s1.sal);
    Student s2 = new Student(101,"Aditya");
    System.out.println(s2.id);
    System.out.println(s2.name);
    System.out.println();
    System.out.println();
    System.out.println("============");
  }
}
    
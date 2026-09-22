package constructor_overloading;

class Student{
  int id;
  String name;
  String gender;
  double sal;
  Student(int id){
    this.id=id;
    System.out.println("Student Constructor!");
  }
  Student(int id,String name){
    this.id=id;
    this.name=name;
    System.out.println("Student Constructor!");
  }
  Student(int id,String name,String gender){
    this.id=id;
    this.name=name;
    this.gender=gender;
    System.out.println("Student Constructor!");
  }
  Student(int id,String name,String gender,double sal){
    this.id=id;
    this.name=name;
    this.gender=gender;
    this.sal=sal;
    System.out.println("Student Constructor!");
  }
}

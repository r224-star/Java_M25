class EmployeeDriver {
  public static void main(String[] args) {
    Employee e1 = new Employee(101, "Aditya", "male", 2500000);
    Employee e2 = new Employee(102, "Sunil", "male", 2500000);
    Employee e3 = new Employee(103, "Manu", "male", 2500000);
    Employee e4 = new Employee(104, "Adi", "male", 2500000);

    System.out.println("Emp Details1");
    System.out.println(e1.id);
    System.out.println(e1.name);
    System.out.println(e1.gender);
    System.out.println(e1.sal);

    System.out.println("Emp Details2");
    System.out.println(e2.id);
    System.out.println(e2.name);
    System.out.println(e2.gender);
    System.out.println(e2.sal);

    System.out.println("Emp Details3");
    System.out.println(e3.id);
    System.out.println(e3.name);
    System.out.println(e3.gender);
    System.out.println(e3.sal);

    System.out.println("Emp Details4");
    System.out.println(e4.id);
    System.out.println(e4.name);
    System.out.println(e4.gender);
    System.out.println(e4.sal);
  }
}
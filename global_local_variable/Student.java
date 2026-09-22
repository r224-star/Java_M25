class Student {

    // Global-level (instance) variables
    String name = "Rajesh";
    int age = 22;
    String course = "MCA";

    public static void main(String[] args) {

        // Local variable
        int marks = 85;

        Student s = new Student();

        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
        System.out.println("Course: " + s.course);
        System.out.println("Marks: " + marks);
    }
}
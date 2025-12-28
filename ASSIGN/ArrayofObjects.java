class Student {
    String name; int age;
    Student(String name, int age) { this.name = name; this.age = age; }
    public String toString() { return name + ":" + age; }
}
public class ArrayofObjects {
    static Student[] createStudents() {
        Student[] arr = { new Student("Sam", 20), new Student("Alex", 22) };
        return arr;
    }
    public static void main(String[] args) {
        Student[] students = createStudents();
        for (Student s : students)
            System.out.println(s);
    }
}

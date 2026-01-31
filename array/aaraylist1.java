import java.util.*;
class Student {
  String name;
  int age;

  Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String toString() {
    return name + " (" + age + ")";
  }
}

public class aaraylist1 {
  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student("Ravi", 21));
    students.add(new Student("Meera", 20));

    for (Student s : students) {
      System.out.println(s);
    }
  }
}

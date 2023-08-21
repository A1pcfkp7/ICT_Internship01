import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public Student() {
        this.name = "";
        this.age = 0;
        this.course = "";
    }

    public void accept() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = in.nextLine();
        System.out.print("Enter age: ");
        age = in.nextInt();
        in.nextLine(); // Consume the newline left by nextInt()
        System.out.print("Enter course: ");
        course = in.nextLine();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String args[]) {
        Student obj = new Student();
        obj.accept();
        obj.display();
    }
}

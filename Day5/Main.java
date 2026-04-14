package Day5;

class AppForm {
    // whenever object is created than only constructor will call again and again
    // but static will call at first and only one time than after constructor will
    // call

    AppForm(String name) {
        System.out.println("Hello " + name);
    }

    static {
        System.out.println("wlcm");
    }
}

// Inheritance
// -> single level / multi level / hierarchical / multiple / hybrid

// single Level
// - parent ---> child

// Multiple Level
// - parent ---> parent ---> child

// Hierarchical
// - parent
// child child

// Multiple
// - parent parent
// child

public class Main {
    public static void main(String[] args) {
        // AppForm s1 = new AppForm("Aniket");

    }

}

// Mutiple Inheritance

// 01
// public class Main {
// public static void main(String[] args) {
// Student s1 = new Student("Sai", 18, 56432, 8.9);
// s1.show();

// Employee e1 = new Employee("Sam", 19, 113, 32000);
// e1.show();
// }
// }

// class Human {
// private String name;
// private int age;

// Human(String name, int age) {
// this.name = name;
// this.age = age;
// }

// void display() {
// System.out.println("NAME : " + this.name);
// System.out.println("AGE : " + this.age);
// }
// }

// class Student extends Human {
// private int roll;
// private double cgpa;

// Student(String name, int age, int roll, double cgpa) {
// super(name, age);
// this.roll = roll;
// this.cgpa = cgpa;
// }

// void display() {
// System.out.println("ROLL NO : " + this.roll);
// System.out.println("CGPA : " + this.cgpa);
// }

// void show() {
// super.display();
// this.display();
// System.out.println();
// }
// }

// class Employee extends Human {
// private int empNo;
// private int salary;

// Employee(String name, int age, int empNo, int salary) {
// super(name, age);
// this.empNo = empNo;
// this.salary = salary;
// }

// void display() {
// System.out.println("EMP NO : " + this.empNo);
// System.out.println("SALARY : " + this.salary);
// }

// void show() {
// super.display();
// this.display();
// System.out.println();
// }
// }

// 02

// public class Main {
// public static void main(String[] args) {
// Shape s;
// s = new Circle();
// s.draw();

// s = new Rectangle();
// s.draw();
// }
// }

// class Shape {
// void draw() {
// System.out.println("Drawing any Shape");
// }
// }

// class Circle extends Shape {
// void draw() {
// System.out.println("Drawing Circle");
// }
// }

// class Rectangle extends Shape {
// void draw() {
// System.out.println("Drawing Rectangle");
// }
// }

// // Hierarchical Inheritance :
// // https://onlinegdb.com/wa8GvFv7N

// public class Main
// {
// public static void main(String[] args) {
// WorkingStudents ws = new WorkingStudents();

// ws.setStudent(15, 8.6);
// ws.setEmployee(12345, 59000);
// ws.display();
// }
// }

// interface Student {
// void setStudent(int rollNo, double cgpa);
// void showStudent();
// }

// interface Employee {
// void setEmployee(int empNo, int salary);
// void showEmployee();
// }

// class WorkingStudents implements Student, Employee {
// private int rollNo;
// private double cgpa;
// private int empNo;
// private int salary;

// public void setStudent(int rollNo, double cgpa) {
// this.rollNo = rollNo;
// this.cgpa = cgpa;
// }

// public void showStudent() {
// System.out.println("ROLL NO : " + this.rollNo);
// System.out.println("CGPA : " + this.cgpa);
// }

// public void setEmployee(int empNo, int salary) {
// this.empNo = empNo;
// this.salary = salary;
// }

// public void showEmployee() {
// System.out.println("EMP NO : " + this.empNo);
// System.out.println("SALARY : " + this.salary);
// }

// void display() {
// this.showStudent();
// this.showEmployee();
// System.out.println();
// }
// }

// Hierarchical Inheritance :
// https://onlinegdb.com/wa8GvFv7N

// Runtima Polymorphism :
// https://onlinegdb.com/S4G5yx3Ec5

package Oops;

// class Pen {
//     String color;
//     String type; // ballpoint; gel

//     public void write() {
//         System.out.println("writing something " + color + type);
//     }

//     public void printColor() {
//         System.out.println(this.color);
//     }

// }

class Student {

    String name;
    int age;
    String lastName;

    // nonperamiterized constructor if we do not give any pera to obj then this con
    // will called

    Student() {
        System.out.println("Constructore called");

    }

    // peramiterized constructor

    Student(String name, int age) {

        this.name = name;
        this.age = age;
    }

    // copy constructor passing obj to other obj or con

    Student(Student s2, String lastName) {

        this.name = s2.name;
        this.age = s2.age;
        this.lastName = lastName;
    }

    public void printInfo() {
        System.out.println(this.name + " " + this.age + " " + this.lastName);
    }

}

public class Basic {
    public static void main(String args[]) {

        // { Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";
        // pen1.write();

        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "ball";

        // pen1.printColor();
        // pen2.printColor();}

        Student s1 = new Student("udit", 20);
        // s1.name = "udit";
        // s1.age = 20;

        s1.printInfo();

        Student s2 = new Student(s1, "chauhan");
        s2.printInfo();

    }
}
package Oops;

class Student {
    String name;
    int age;

    // function overloading
    public void printInfo(String name) {
        System.out.println(name);

    }

    public void printInfo(int age) {
        System.out.println(age);

    }

    public void printInfo(String name, int age) {
        System.out.println(age + " " + name);

    }
}

public class polymor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "ajay";
        s1.age = 19;

        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);

    }

}

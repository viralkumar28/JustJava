import java.util.Scanner;
 class Student{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name+" "+age );
    }
}
public class Polymorphism {

    public static void main(String[] args) {
        Student s = new Student();
        s.printInfo("Viral");
        s.printInfo(22);
        s.printInfo("Viral",22);
    }
}

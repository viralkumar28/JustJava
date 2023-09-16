public class OOPs {

    static class Student{
        String name;
        int age;
        public void Details(){
            System.out.println(this.name);
            System.out.println(this.age);
        }
        Student(){
            System.out.println("Welcome");
        }

    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Viral";
        s1.age = 22;
        s1.Details();
    }
}

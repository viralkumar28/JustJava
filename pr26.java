import java.util.Scanner;

public class pr26 {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);    
        int age = in.nextInt();
        voting(age);
        in.close();
    }
    static void voting(int age){
        if(age >= 18){
            System.out.println("Allowed for voting");
        }else{
            System.out.println("Not allowed");
        }
    }
}

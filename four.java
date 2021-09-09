import java.util.Scanner;

public class four {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float a = sc.nextFloat();
        System.out.println("Enter a number: ");
        float b = sc.nextFloat();
        float c = a*b;
        System.out.println(c);
        sc.close();
    }
}

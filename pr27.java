import java.util.Scanner;

public class pr27 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(multiply(num1,num2));
        in.close();
    }

    static int multiply(int a,int b) {
        int mul = a*b;
        return mul;
    }
}

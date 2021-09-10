import java.util.Scanner;

public class six {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        float b = sc.nextInt();
        float d = a / b;
        float c = a % b;
        System.out.println(d+" "+c);
        sc.close();

    }
}

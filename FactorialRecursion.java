import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        facto(n, 1);
        sc.close();
    }
    static void facto(int n, int fact){
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact = fact *n;
        facto(n-1,fact);

    }
}

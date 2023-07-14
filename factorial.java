import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(facto(n));

        sc.close();
    }
    public static int facto(int n){
        int fact =1;
        for(int i=n;i>=1;i--){
            fact = fact * i;
        }
        return fact;
    }
}

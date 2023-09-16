import java.util.Scanner;

public class Recusion {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        p(n);
        sc.close();
    }
    static void p(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        p(n+1);
    }
}

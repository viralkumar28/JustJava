import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        factorial(n);
        sc.close();
    }
    static void factorial(int n){
        if(n<0){
            System.out.println("Invalid Number");
        }else if(n==0){
            System.out.println("1");
        }else{
            int factorial =1;
        for(int i=n;i>=1;i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        }
    }
}

import java.util.Scanner;

public class Fibonaccirecursion {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(0,1,n);

    }
    public static void fibonacci(int i,int j, int n){
        if(n<0){
            return ;
        }
        System.out.println(j);
        fibonacci(j,i+j,n-1);
    }
}

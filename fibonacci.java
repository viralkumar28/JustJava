import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        int n= sc.nextInt();
        fibo(n);
        sc.close();

    }
    static void fibo(int n){

        int a=0,b=1;
        int sum=0;
        System.out.print(a+" "+b+" ");
       for(int i=1;i<=n;i++){
            sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b = sum;
            
       }
    }
}

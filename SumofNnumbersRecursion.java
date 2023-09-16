import java.util.Scanner;

public class SumofNnumbersRecursion {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        naturalNumber(n,0);
        sc.close();
    }
    static void naturalNumber(int n, int i){
        if(n==0){
            System.out.println(i);
            return;
        }

        i = i + n;
        naturalNumber(n-1, i);
    }
}

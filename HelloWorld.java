import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum = sum +ar[i];
        }
        System.out.println(sum);
    }
}
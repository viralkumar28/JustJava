import java.util.Scanner;

public class veryBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
        }
        System.out.println(bigInt(arr));;

        sc.close();
    }
    static long bigInt(long[] arr){
        long sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
}

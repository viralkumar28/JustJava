import java.util.Scanner;

public class pr35 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt(),sum=0;
        int arr[] = new int[n];
        for(int i=0;i<=n;i++){
             sum = sum+n;
        }
        int avg = sum/arr.length;
        System.out.println(avg);
        sc.close();
    }
}

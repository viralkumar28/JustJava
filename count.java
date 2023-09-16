import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(add(arr));
        sc.close();
    }
    public static int add(int[] arr){
        int count =0;
        for(int i=0;i<arr.length;i++){
            count += arr[i];
        }
        return count;
    }
}

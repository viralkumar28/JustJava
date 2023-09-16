import java.util.Scanner;

public class diagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        System.out.println(diagonalSub(arr));
        sc.close();
    }

    public static int diagonalSub(int[] arr) {
        int count=0;
        int sub = 0;
        for(int i=0;i<arr.length;i++){
                if(arr[i] != 0 ){
                    arr[i] += count;
            }i++;
        }

        return count;

    }
}

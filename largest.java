import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i] > result)
            result = arr[i];
        }
        System.out.println(result);
        sc.close();

    }
}

import java.util.Scanner;

public class GivenValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean f = false;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int find = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i] == find){
              f = true;
              break;
            }
        }
        if(f){
            System.out.println("Found");
        }else{
            System.out.println(" Not Found");
        }
        sc.close();
    }
}

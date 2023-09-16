import java.util.Scanner;

public class maxWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(wealth(arr));
        sc.close();
    }
    public static int wealth(int[][] arr){
        int sum =0;
        int ans= 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum += arr[i][j];
            }
            if(sum>ans) {
                ans = sum;
            }
            sum=0;
        }

        return ans;
    }
}

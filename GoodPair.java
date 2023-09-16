import java.util.Scanner;

public class GoodPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }
      int ans  = goodPair(num);
        System.out.println(ans);
        sc.close();
    }
    public static int goodPair(int[] num){
        int k = 0;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i] == num[j] && i<j){
                    System.out.print(i+" "+j);
                }
                if((num[i] | num[j]) >= k){
                    k++;
                }
                System.out.println();
            }
        }

        return k;
    }
}

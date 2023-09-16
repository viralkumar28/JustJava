import java.util.Scanner;

public class maxChocolate {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int n= sc.nextInt();
        boolean ans = false;
        int[] candies = new int[n];
        for(int i=0;i<n;i++){
            candies[i] = sc.nextInt();
        }
        int extra = sc.nextInt();
        for(int i=0;i<n;i++){
            candies[i] += extra;
        }

        for (int i=0;i<n;i++){
            if(candies[i] >= 5){
                ans = true;
            } else if (candies[i] < 5) {
                ans = false;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}

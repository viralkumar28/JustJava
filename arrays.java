import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arry = new int[n];
        for(int i=0;i<n;i++){
           arry[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arry[i] == x){
                System.out.println("X found at "+i);
            }
        }
       
        sc.close();
    }
}

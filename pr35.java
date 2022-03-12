import java.util.*;

public class pr35 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[arr.length] = sc.nextInt();    
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[n]);
        }
        
        sc.close();
    }
}

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[number];
        for(int i=0;i<number;i++){
            arr[i] = sc.nextInt();
        }
        int temp;
        for(int i=0;i<number;i++){
            for(int j=i+1;j<number;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }

       sc.close();
    }
}

import java.util.Scanner;

public class CompareTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =3;
        int alice =0;
        int bob =0;
        int[] arr = new int[a];
        int[] arrItem = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<a;i++){
            arrItem[i] = sc.nextInt();
        }
        for(int i=0;i<a;i++){
            if(arr[i] > arrItem[i]){
                alice++;
            }else if(arr[i] < arrItem[i]){
                bob++;
            }
        }
        System.out.println(alice+" "+bob);
        sc.close();
    }
}

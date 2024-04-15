import java.util.Scanner;
public class practice1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int first = 0;
        int second = 1;
        int a = sc.nextInt();
        System.out.print(first+" "+second);
        for(int i=0;i<a;i++){
            int temp = first + second;
            System.out.print(" "+temp);
            first = second;
            second = temp;
        }
        sc.close();
    }
}

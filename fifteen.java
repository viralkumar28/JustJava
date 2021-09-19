import java.util.*;
public class fifteen {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum =0;
        for(int i=0;i<=a;i++){
            sum += i;
        }
        System.out.println("Sum = " +sum);
        sc.close();
    }
}

import java.util.*;
public class Prac6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem, rev=0;
        int num = sc.nextInt();
        while(num != 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10 ;
        }
        System.out.println(rev);
        sc.close();
    }
}

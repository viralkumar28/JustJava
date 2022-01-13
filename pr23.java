//counting occurrences

import java.util.*;

public class pr23 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);

        int num = sc.nextInt();
        int n = sc.nextInt();
        int count=0;
        while(num > 0){
            if(num % 10 == n){
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
        sc.close();

    }
}

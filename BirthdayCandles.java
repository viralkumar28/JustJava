import java.util.*;
class Candles{
    public static int cake(int[] ar){
        int count = 0;
        for(int i=0;i<ar.length;i++){
            if(ar[i] == ar[i+1])
                count++;
        }
        return count;
    }
}
public class BirthdayCandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=4;
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        int result = Candles.cake(ar);
        System.out.println(result);
        sc.close();
    }
}

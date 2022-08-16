import java.util.*;
public class prac4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rupee = sc.nextInt();
        int usd = 80;
        int converted = usd * rupee;
        System.out.println("Converted = "+converted);
        
        sc.close();
    }
}

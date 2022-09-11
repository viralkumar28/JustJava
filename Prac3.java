import java.util.*;
public class Prac3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=10,b=20,c=30,result;
        result = ((a>b)?(a>c)?a:c:(b>c)?b:c);
        System.out.println(result);
        sc.close();
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class pr26 {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);    
        fun(2,3,4,5,6,1,8,9);
        
        in.close();
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}

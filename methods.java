import java.util.*;
public class methods {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calculate(a,b));



        sc.close();
    }
    public static int calculate(int a,int b){

        int sum;
        sum = a+b;
        return sum;
    }
}

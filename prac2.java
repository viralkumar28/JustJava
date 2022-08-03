import java.util.*;
public class prac2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int a=0,b=1,c;
        int num = sc.nextInt();
        System.out.println(a+" "+b);
        for(int i=0;i<num;i++){
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
        sc.close();   
    }
}

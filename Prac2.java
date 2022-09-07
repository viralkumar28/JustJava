import java.util.*;
public class Prac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0,b=1,c=0;
        int n= sc.nextInt();
        System.out.println(a+" "+b);
        for(int i=0;i<n;i++){
         c = a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
        
        sc.close();
    }
}

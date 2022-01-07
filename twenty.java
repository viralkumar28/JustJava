import java.util.*;
public class twenty {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = 0 ;
        int b = 1;
        int c = sc.nextInt();
       
        for(int i=1;i<=c;++i){
            System.out.print(a+" ");
            int d = a+b;
                a=b;
                b=d;
        }
        sc.close();
    }
}

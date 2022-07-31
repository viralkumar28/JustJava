import java.util.*;
public class prac2 {
    public static void main(String[] args) {
        int a=0,b=1,c;
        Scanner sc = new Scanner (System.in);
        int count = sc.nextInt();
        System.out.println(a+" "+b);
        for(int i=2;i<count;++i){
            c=a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
        }
        sc.close();

        
    }
}

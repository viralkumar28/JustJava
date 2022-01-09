import java.util.*;
public class twentyone {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        max(a,b,c);
        min(a,b,c);
        sc.close();
    }
    static void max(int a,int b,int c){
        if(a>b){
            if(a>c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }
         else if(b>c){
            System.out.println(b);
         }
         else{
            System.out.println(c);
         }
    }
    static void min(int a, int b,int c){
        if(a<b){
            if(a<c){
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }
        else if(b<c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
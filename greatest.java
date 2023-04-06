import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(greatest(a,b,c));

        sc.close();
    }
  static int greatest(int a,int b,int c){
  
        if(a>b){
            if(a>c){
                return a;
            }
        }else if(b>c){
            return b;
        }
        return c;
    }
}

import java.util.*;
public class pr33 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(hcf(n, m));
        System.out.println(lcm(n,m));
        sc.close();
    }
    static int hcf(int n,int m){
    int hcf =1;
        for(int i=1;i<=n && i<=m;i++){
             if(n%i==0 && m%i==0){
                 hcf = i;
             }
        }
        return hcf;        
    }
    static int lcm(int n, int m){
        int lcm=0;
        for(int i=1;i<=n && i<=m;i++){
            if(n%i==0 && m%i==0){
             lcm=(n*m)/hcf(n, m);
            }
        }
        return lcm;
    }
}

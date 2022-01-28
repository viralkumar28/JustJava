import java.util.Scanner;

public class pr29 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        prime(n);        
        in.close();
    }

    static void prime(int n) {
        if(n==1 || n==0){
            System.out.println("Not Prime");
        }else{
            for(int i=2;i<=n;){
                if(n%i==0){
                    System.out.println("Not Prime");
                    break;
                }else{
                    System.out.println("Prime");
                    break;
                }
            }
        }   

    }
}

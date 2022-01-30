import java.util.Scanner;

public class pr31 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        fact(num);
        in.close();
    }
    static void fact(int num){
        int fact =1;
        for(int i=1;i<=num;i++){
            fact = fact *i;
        }
        System.out.println(fact);
    }
}
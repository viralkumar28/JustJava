import java.util.Scanner;

public class pr22 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        evenandodd(num);
        sc.close();

    }
    static void evenandodd(int num){
        if(num % 2==0){
            System.out.println("even");
        }else{
            System.out.println("odd ");
        }
    }
}

import java.util.Scanner;

public class ten {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("A is greatest");
            }
            else{
                System.out.println("C is greatest");
            }
        }
        else if(b>c){
            System.out.println("B is greatest");
        }
        else{
            System.out.println("C is greatest");
        }
        sc.close();
    }
}

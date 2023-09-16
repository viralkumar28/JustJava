import java.util.Scanner;
public class fibopattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }


    }
}

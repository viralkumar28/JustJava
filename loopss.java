import java.util.Scanner;

public class loopss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // from this link you can  get all the patters program https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/

        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

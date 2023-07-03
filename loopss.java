import java.util.Scanner;

public class loopss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // from this link you can  get all the patters program https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/

        int n = sc.nextInt();
//        int m = sc.nextInt();

//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//            for(int i=0;i<=n;i++){
//                for(int j=0;j<=i;j++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        for(int i=1; i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

//        for(int i=n;i>=1;i--){
//            for(int j=i;j>=1;j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        for(int i=1;i<=n;i++){
            for(int k=1;k<n-i;k++){ //for spaces so that stars can print in the middle
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i%2!=0){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }


    }
}

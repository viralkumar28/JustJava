import java.util.Scanner;

public class findanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        //for input
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int x =sc.nextInt();

        //for output
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j] == x)
                System.out.print(i+" "+j);
            }
            System.out.println();
        }


        sc.close();
    }
}

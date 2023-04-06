import java.util.Scanner;

public class multilevelarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] number = new int[rows][cols];

        //for input
        //it controls the outer loop
        for(int i=0;i<rows;i++){
            //it controls the inner loop
            for(int j=0;j<cols;j++){
                
                number[i][j] = sc.nextInt();
            }
        }

        //for output
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        } 
        

        sc.close();
    }
}

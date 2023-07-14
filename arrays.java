import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[] marks = new int[3];
       marks[0] = 97;
       marks[1] = 98;
       marks[2] = 96;
       for(int i=0;i<3;i++){
           System.out.println(marks[i]);
       }
        sc.close();
    }
}

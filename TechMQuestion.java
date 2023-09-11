import java.util.Scanner;

public class nQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dS = sc.nextLine();
        System.out.println(unChanged(dS));
    }
    public static int unChanged(String dS){
        int count = 0;
        int i=0;
        int j = dS.length() - 1;
        while(i<j){
            if(dS.charAt(i) == dS.charAt(j)){
                count = count +2;
            }
            i++;
            j--;
        }
        if(i==j){
            count++;
        }
        return count;
    }
}

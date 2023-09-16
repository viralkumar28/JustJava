import java.util.Scanner;

public class learnString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        int toLength = 0;
        for(int i=0;i<n;i++){
            name[i] = sc.next();
            toLength += name[i].length();
        }
        System.out.println(toLength);

        sc.close();
    }
}

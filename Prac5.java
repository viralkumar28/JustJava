import java.util.*;
public class Prac5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        if(num > 0.0){
            System.out.println("Positive");
        }else if(num < 0.0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
        sc.close();
    }
}

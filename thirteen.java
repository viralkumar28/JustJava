import java.util.*;
public class thirteen {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not leap year");
        }
        sc.close();
    }
}

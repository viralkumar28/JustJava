import java.util.*;
public class prac4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.toUpperCase() != null ){
            System.out.println(str.toLowerCase());
        }else{
            System.out.println(str);
        }
        sc.close();
    }
}

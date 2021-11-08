import java.util.*;

public class eighteen {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(isNullEmpty(a));

        sc.close();
    }
    public static String isNullEmpty(String a) {
        if(a == null){
            return "NULL";
        }else if(a.isEmpty()){
            return "Empty";
        }else{
            return a;
        }
            
    }
}

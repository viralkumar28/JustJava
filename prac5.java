import java.util.*;
public class prac5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =12321;
        int orgnum = num;
        int count =0;
        while(num>0){
            int rem = num % 10;
           num = num /10;
            count = count*10+rem;
        }
        if(orgnum == count){
            System.out.println("palindrome");
        }else
        System.out.println("not palindrome");
        sc.close();
    }
}

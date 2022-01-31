import java.util.Scanner;

public class pr32{
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int num = sc.nextInt();
        palindrome(num);
        sc.close();
    }
    static void palindrome(int num){
        int ans = 0;
        int temp = num;
        while(num>0){
         int rem = num % 10;
         num = num /10;
         ans = ans * 10 + rem;
        }
        if(temp == ans){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}

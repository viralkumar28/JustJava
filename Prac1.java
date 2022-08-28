import java.util.*;
public class Prac1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      int num = sc.nextInt();
      int num1 = num;
      int rem = 0,sum=0;
      while(num>0){
        rem = num % 10;
        sum = (sum*10)+rem;
        num = num / 10;
      }
      if(num1 == sum){
        System.out.println("Palindrome");
      }else{
        System.out.println("Not Palindrome");
      }
        sc.close();
    }
}

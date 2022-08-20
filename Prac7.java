import java.util.*;
public class Prac7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        if(num==0 || num==1 ){
            System.out.println("Not Prime");
        }else if(num%2==0 && num%3==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    sc.close();
    }
}

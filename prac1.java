import java.util.*;
class prac1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0 || num%3==0){
            System.out.println("not prime");
        }else{
            System.out.println("prime");
        }

        sc.close();
    }
}
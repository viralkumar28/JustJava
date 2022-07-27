import java.util.*;
class prac1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c=2;
        if(c<num){
            if(num%c==0){
                System.out.println("Not Prime");
            }else{
                c++;
            } 
        }else{
            System.out.println("Prime ");
        }

        sc.close();
    }
}
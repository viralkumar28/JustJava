import java.util.*;
class prac1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c=2;
        boolean flag = false;
        while(c<num){
            if(num%c==0){
                System.out.println("Not Prime");
                break;
            }
                c++;
                flag = true;
        }
        if(flag == true){
            System.out.println("Prime");
        }
        sc.close();
    }
}
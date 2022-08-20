import java.util.*;
public class Prac7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int c = 2;
        int num=sc.nextInt();
        if(num==0 || num==1 ){
            System.out.println("Not Prime");
        }
        while(num>c){
            if(num%c==0){
                System.out.println("Not Prime");
                break;
            }
            c++;
            flag = true;
        }
        if(num ==2 || flag == true){
            System.out.println("Prime");
        }
        
    sc.close();
    }
}

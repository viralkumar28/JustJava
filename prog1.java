import java.util.*;
public class prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if(num%31==0 && num%41==0){
                System.out.println("Foo");
            }else if(num%41==0){
                System.out.println("Bar");
            }else if(num%31==0 && num%41==0){
                System.out.println("Foo");
            }else{
                System.out.println("Number is not divisible");
            }

        sc.close();

    }
}

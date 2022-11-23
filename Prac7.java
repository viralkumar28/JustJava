import java.util.Scanner;
public class Prac7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        for(int i=0;i<10;i++){
            sum();
        }
        
         

        sc.close();
    }

    static void sum(){
        int a=10,b=20;
        System.out.println(a+b);
    }

}

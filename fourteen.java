import java.util.Scanner;

public class fourteen {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       float a = sc.nextFloat(); 
       if(a>0.0){
           System.out.println("Positive");
       }else if(a<0.0){
           System.out.println("Negative");
       }
       else if(a == 0.0){
           System.out.println("Zero");
       }
       else{
           System.out.println("Special Character");
       }
       sc.close();
      
       
    }
}

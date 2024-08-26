import java.util.Scanner;
public class three {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float numberOne = sc.nextFloat();
    float numberTwo = sc.nextFloat();
    sc.close();
    System.out.println(mul(numberOne, numberTwo));
   }
   static float mul(float numberOne, float numberTwo){
    float mul = numberOne * numberTwo;
    return mul;
   }
    
}

import java.util.*;
public class Factors {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number1=sc.nextInt(), number2=sc.nextInt(), HCF;
        sc.close();
        while(number2!=0){
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        HCF = number1;
        System.out.println(HCF);
        System.out.println((number1*number2)/ HCF);
    }
}

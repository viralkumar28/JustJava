import java.util.Scanner;
public class five {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int quotient;
        int remainder;
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        sc.close();
        quotient = number1/number2;
        remainder = number1%number2;
        System.out.println(quotient+ " "+remainder);


    }
}

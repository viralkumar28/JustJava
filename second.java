import java.util.Scanner;

public class second {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        sc.close();
        System.out.println(add(numberOne, numberTwo));
    }
    static int add(int numberOne, int numberTwo){
        int sum = numberOne + numberTwo;
        return sum;
    }
}

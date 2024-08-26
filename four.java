import java.util.Scanner;
public class four {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(1);
        int ascii = ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        scanner.close();
    } 
}

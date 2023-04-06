import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String lastname = sc.next();
        String fullname = name+" "+lastname;
        System.out.println(fullname.length());
        
        sc.close();
        }
}
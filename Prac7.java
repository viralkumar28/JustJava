import java.util.Scanner;
public class Prac7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            if(Character.isDigit(curr)){
                sb.append(""+i);
            }
        }
        System.out.println(str.toString());
        sc.close();
    }
}

import java.util.*;

public class StringBuilders {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.next());
        for(int i=0;i<str.length()/2;i++){
            int back = str.length()-1-i;
            char frontChar = str.charAt(i);
            char backChar = str.charAt(back);
            str.setCharAt(i, backChar);
            str.setCharAt(back, frontChar);
        }
        System.out.println(str);
        sc.close();
    }
}

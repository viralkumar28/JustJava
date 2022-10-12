import java.util.*;
public class Prac6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    if((ch >= 'a' && ch <= 'z')||( ch >='A' && ch <='Z')){
        System.out.println("Alphabet");
    }else{
        System.out.println("Not Alphabet");
    }
    // System.out.format(null, null, args);
    sc.close();
  }  
}

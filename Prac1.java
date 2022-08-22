import java.util.*;
public class Prac1 {
    public void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        String find = sc.nextLine();
        findFrequency(str,find);
        System.out.println();
        sc.close();
    }

    private static void findFrequency(String str, String str1) {
        if(str.contains(str1)){
           System.out.println();
        }else{
            System.out.println("Word not found");
        }
    }
}

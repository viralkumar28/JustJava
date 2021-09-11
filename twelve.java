import java.util.*;

public class twelve {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        for(String word : s.split(" ")){
            if(word.length() % 2 == 0){
                System.out.println(word);
            }
                
        }
        
        scan.close();
    }
}


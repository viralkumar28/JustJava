import java.util.*;
public class eight {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        char ch = reader.next().charAt(0);
        reader.close();
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.println("Vowel");
            break;
            default :
            System.out.println("Consonant");
        }
    }
}

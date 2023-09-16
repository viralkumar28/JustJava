import java.util.Scanner;

public class replaceString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str= sc.next(), nstr="";
        char ch;

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
        sc.close();
    }
}

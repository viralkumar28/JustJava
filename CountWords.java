import java.util.Scanner;

public class CountWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] words = new String[n];
        for(int i=0;i<n;i++){
            words[i] = sc.nextLine();
        }
        wordCount(words);
        System.out.println(words);

        sc.close();
    }
    public static int wordCount(String[] words){

        for(int i=0;i<words.length;i++){

        }


        return 1;
    }
}

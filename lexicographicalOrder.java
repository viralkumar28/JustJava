import java.util.Scanner;

public class lexicographicalOrder {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0;i<str.length;i++){
            str[i] = sc.next();
        }
        for(int i=0;i<str.length;i++){
            for(int j=i+1;j<str.length;j++){
                if(str[i].compareTo(str[j])>0){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }

        sc.close();
    }
}

import java.util.Scanner;

public class pr36 {
    public static void main(String[] args) {
        // int r, sum=0, temp;
        // int n = 454;
        // temp = n;
        // while(n>0){
        //     r= n%10;
        //     sum=(sum*10)+r;
        //     n=n/10;

        // }
        // if(temp== sum)
        //     System.out.println("palindrome");
        // else    
        //     System.out.println("noy palindrome");

        String original , reverse="";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        original = sc.nextLine();
        int length = original.length();
        for(int i = length -1 ;i>=0;i--)
            reverse = reverse + original.charAt(i);
        if(original.equals(reverse))
        System.out.println("palindrome");
        else
        System.out.println("not palindrome");
        sc.close();

    }
}

import java.util.Scanner;

public class pr34 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      int a=sc.nextInt(),b=sc.nextInt();
      prime(a,b);
        sc.close();
       }
       public static void prime(int a,int b){
            for(int i=a;i<=b;i++){
                if(i%2!=0 && i%3!=0){
                    System.out.println(i);
                }
        if(i/2==0)
        System.out.println("Not prime");
            }
       }
}
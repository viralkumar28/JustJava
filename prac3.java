// import java.util.*;
// class prac3{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//        if(n%2==0){
//         System.out.println("even");
//        }else{
//         System.out.println("odd");
//        }
//         sc.close();
//     }
// }

//Second
// import java.util.*;
// class prac3{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         System.out.println(str+" Viral");

//         sc.close();
//     }
// }


//Third
// import java.util.*;
// class prac3{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int p = sc.nextInt();
//         int t = sc.nextInt();
//         float r = sc.nextFloat();
//         float si = (p*t*r)/100;
//         System.out.println(si);

//         sc.close();
//     }
// }

//Fourth
import java.util.*;
class prac3{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(ch =='+'){
            System.out.println(a+b);
        }else if(ch == '-'){
            System.out.println(a-b);
        }else if(ch == '*'){
            System.out.println(a*b);
        }else if(ch == '/'){
            System.out.println(a/b);
        }else{
            System.out.println(a%b);
        }
        sc.close();
    }
}
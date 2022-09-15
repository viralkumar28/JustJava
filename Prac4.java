import java.util.*;
class Prac4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4==0){ //this line will show if the year is divisible by 4 or not.
            System.out.println("Leap Year");
        }else{
            System.out.println("Not Leap Year");
        }
        sc.close();
    }
}
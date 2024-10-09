import java.util.*;
public class nine {
    public static void main(String args[]){
        Scanner reader =  new Scanner(System.in);
        int number1 = reader.nextInt();
        int number2 = reader.nextInt();
        int number3 = reader.nextInt();
        reader.close();
        if(number1>number2){
            if(number1>number3)
            System.out.println(number1+" is greatest");
        }else if(number2>number3){
            System.out.println(number2+" is greatest");
        }else{
            System.out.println(number3+" is greatest");
        }
    }
}

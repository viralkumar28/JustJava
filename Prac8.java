import java.util.*;
class Prac8{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        boolean temp = false;
        
        for(int i=2;i<=num/2;++i){
            if(num%i==0){
                temp = true;
            break;
            }
            
        }
        if(num ==0 || num ==1){
            System.out.println("Not Prime");
        }else if(!temp){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
        sc.close();
    }
}
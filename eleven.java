import java.util.*;
public record eleven() {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int checkPrimeNumber = sc.nextInt();//The number which we want to check is prime or not
        sc.close();
        if(checkPrimeNumber <=1){      //The prime number should be greater than 1.
                System.out.println("Not Prime");  
                return;   
        }
        for(int lowerLimit=2;lowerLimit< checkPrimeNumber;lowerLimit++){
            if(checkPrimeNumber % lowerLimit == 0){ //Ex. 15%2==1, 15%3==0
                System.out.println("Not Prime");
                return;
            }
         }
        System.out.println("Prime");
        }   
    }        



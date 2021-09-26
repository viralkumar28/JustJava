import java.util.*;
// import java.lang.*;
// import java.io.*;
public class sixteen{
    public static void main(String[] args)throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
		int marks[] = new int[3];
		for(int i=0;i< marks.length;i++){
            marks[i] = sc.nextInt();
		}
        int secondLargest = findSecondLargest(marks);
		System.out.println(secondLargest);
        sc.close();
	}
	public static int findSecondLargest(int array[]){

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for(int i=0; i<array.length;i++){
            if(array[i]>=highest){
                secondHighest = highest;
                highest = array[i];
            }else if(array[i] >= secondHighest && array[i]!=highest){
                secondHighest = array[i];
            }
        }

        return secondHighest;
	    
	}
   
}
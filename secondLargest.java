import java.util.*;
public class secondLargest {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int marks[] = new int[3];
		for(int i=0;i<marks.length;i++){
		    marks[i] = sc.nextInt();
		}
		for(int i =0;i<marks.length;i++){
		    for(int j=i+1;j<marks.length;j++){
		        if(marks[i]<marks[j]){
		            int temp = marks[i];
		            marks[i] = marks[j];
		            marks[j] = temp;
		        }
		    }
		}
		System.out.print(marks[1]);
        sc.close();
	}
	
}

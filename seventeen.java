import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class seventeen
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int arr[] = new int[N];
		for(int i=0;i<N;i++){
		    arr[i] = sc.nextInt();
		}
        for(int i=0;i<N;i++){
            if(arr[i] < 10 ){
                System.out.println("Thanks for helping Chef!");
            }
            else{
                System.out.println("-1");
            }
        }
        sc.close();
	}
}

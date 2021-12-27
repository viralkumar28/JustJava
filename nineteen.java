import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class nineteen
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int sum = 0;
        int n = sc.nextInt();
		int T[] = new int[n];
		for(int i=0;i<T.length;i++){
		    int a[] = new int[n];
		    for(int j=0;j<a.length;j++){
		        int []b = new int[a.length];
                for(int k=0;k<b.length;k++){
                    sum = sum + b[i] - 1;
                }
		         
		    } 
		}
        System.out.println(sum);
		sc.close();
	}
}

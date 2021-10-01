import java.util.*;

public class array1 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int q = sc.nextInt();
        int N[] = new int[n];
        int Q[] = new int[q];
		for(int i=0;i<N.length;i++){
		     N[i] = sc.nextInt();
		}
		for(int i=0;i<Q.length;i++){
		    for(int j=0;j<3;j++){
		         Q[j] = sc.nextInt();
		    }
		}
        sc.close();
	}
}

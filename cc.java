import java.util.*;
// import java.lang.*;
// import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		for(int i=0;i < ch;i++){
		    String t = sc.next();
		    if(t.equals("b") || t.equals("B")){
                System.out.println("BattleShip");
            } 
            else if(t.equals("c") || t.equals("C")){
                System.out.println("Cruiser");
            } 
            else if(t.equals("d") || t.equals("D")){
                System.out.println("Destroyer");
            } 
            else if(t.equals("f") || t.equals("F")){
                System.out.println("Frigate");
            } 
		}
		sc.close();
	}
}

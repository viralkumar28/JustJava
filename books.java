
import java.util.*;

class books
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);		
		String sentence = sc.nextLine();

		System.out.println("Oiginal: "+sentence);
		sentence = sentence.replaceAll("\\s", "");
		System.out.println("After replacement: " +sentence);

		sc.close();

	}
}
